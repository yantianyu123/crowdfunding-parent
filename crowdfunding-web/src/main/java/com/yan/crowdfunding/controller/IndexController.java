package com.yan.crowdfunding.controller;

import com.yan.crowdfunding.entity.TAdmin;
import com.yan.crowdfunding.entity.TMenu;
import com.yan.crowdfunding.mapper.TMenuMapper;
import com.yan.crowdfunding.service.TAdminService;
import com.yan.crowdfunding.service.TMenuService;
import com.yan.crowdfunding.utils.Const;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author
 * @date 2020/3/5 20:33
 */
@Controller
public class IndexController {

    @Autowired
    TAdminService adminService;

    @Autowired
    TMenuService menuService;

    Logger log = LoggerFactory.getLogger(IndexController.class);

    /**
     * 跳转到首页页面
     * @return
     */
    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    /**
     * 跳转到登陆页面
     * @return
     */
    @RequestMapping("/login")
    public String login(){

        return "login";
    }

    /**
     * 登陆判断，然后进行重定向后台管理页面
     * @return
     */
    @RequestMapping("/doLogin")
    public String doLogin(String loginacct, String userpswd, HttpSession session, Model model){

        log.debug("loginacct={}",loginacct);
        log.debug("userpswd={}",userpswd);

        Map<String,Object> map = new HashMap<>();
        map.put("loginacct",loginacct);
        map.put("userpswd",userpswd);

        try {
            TAdmin admin = adminService.getTAdminByLogin(map);
            session.setAttribute(Const.LOGIN_ADMIN,admin);

            return "redirect:/main";
        } catch (Exception e) {
            e.printStackTrace();
            model.addAttribute(Const.MESSAGE,e.getMessage());
            log.debug("消息={}",e.getMessage());
            return "login";
        }
    }

    /**
     * 跳转到后台页面
     * @return
     */
    @RequestMapping("/main")
    public String mainPage(HttpSession session){

        List<TMenu> menus = menuService.listTMenu();
        session.setAttribute(Const.MENUS,menus);

        return "main";
    }

    /**
     * 用户注销
     * @return 重定向到首页
     */
    @RequestMapping("/logout")
    public String logout(HttpSession session){

        if(session != null){
            session.removeAttribute(Const.LOGIN_ADMIN);
            session.invalidate();
        }
        return "redirect:/index";
    }

}
