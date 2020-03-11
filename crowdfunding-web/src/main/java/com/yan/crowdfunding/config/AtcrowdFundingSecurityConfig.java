package com.yan.crowdfunding.config;

import com.yan.crowdfunding.component.SecurityUserDetailServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author
 * @date 2020/3/11 15:10
 */
@EnableGlobalMethodSecurity(prePostEnabled = true)
@Configuration
@EnableWebSecurity
public class AtcrowdFundingSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    SecurityUserDetailServiceImpl securityUserDetailServiceImpl;

    /**
     * 使用自定义用户认证
     * @param auth
     * @throws Exception
     */
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(securityUserDetailServiceImpl).passwordEncoder(new BCryptPasswordEncoder());
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //不需要认证的访问路径
        http.authorizeRequests().antMatchers("/static/**","/index.jsp","/loginPage","/index").permitAll()
            .anyRequest().authenticated();//剩下都需要认证
        
        // /login.jsp==POST  用户登陆请求发给Security
        http.formLogin().loginPage("/loginPage")//跳转的登陆页面
                .usernameParameter("loginacct")
                .passwordParameter("userpswd")
                .loginProcessingUrl("/doLogin")//登陆的访问路径
                .defaultSuccessUrl("/main");//登陆成功访问的路径


        //注销
        http.logout().logoutSuccessUrl("/index");
        //管不csrf验证
        http.csrf().disable();
        
        //开启权限不够提示异常
        http.exceptionHandling().accessDeniedHandler(new AccessDeniedHandler() {
            @Override
            public void handle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AccessDeniedException e) throws IOException, ServletException {
                //判断是什么请求
                String requests = httpServletRequest.getHeader("X-Requested-With");
                if("XMLHttpRequest".equals(requests)){
                    //异步请求方式权限不够返回的信息
                    httpServletResponse.getWriter().print("403");
                }else {
                    //同步请求方式权限不够返回的信息
                    httpServletRequest.getRequestDispatcher("/WEB-INF/jsp/error/403.jsp").forward(httpServletRequest,httpServletResponse);
                }
            }
        });
        
        //开启记住密码功能
        http.rememberMe();
    }
}
