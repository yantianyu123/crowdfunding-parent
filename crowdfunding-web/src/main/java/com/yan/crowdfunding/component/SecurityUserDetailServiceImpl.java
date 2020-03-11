package com.yan.crowdfunding.component;

import com.yan.crowdfunding.entity.TAdmin;
import com.yan.crowdfunding.entity.TPermission;
import com.yan.crowdfunding.entity.TRole;
import com.yan.crowdfunding.mapper.TAdminMapper;
import com.yan.crowdfunding.mapper.TPermissionMapper;
import com.yan.crowdfunding.mapper.TRoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author
 * @date 2020/3/11 18:09
 */
@Component
public class SecurityUserDetailServiceImpl implements UserDetailsService {
    
    @Autowired
    TAdminMapper adminMapper;
    @Autowired
    TRoleMapper roleMapper;
    @Autowired
    TPermissionMapper permissionMapper;
    
    
    @Override
    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
        //根据账号查询用户
        TAdmin admin = adminMapper.findTadminByLoginacct(name);
        if(admin != null){
            //存储用户的角色和权限
            Set<GrantedAuthority> authorities = new HashSet<>();
            //查询管理员拥有的角色
            List<TRole> roles = roleMapper.listRoleByAdminId(admin.getId());
            //查询管理员拥有的权限
            List<TPermission> permissions = permissionMapper.listPermissionByAdminId(admin.getId());
            
            for(TRole role : roles){
                if(!StringUtils.isEmpty(role.getName())){
                    authorities.add(new SimpleGrantedAuthority("ROLE_"+role.getName()));
                    //hasRole("管理员") ROLE_管理员
                }
            }
            
            for(TPermission permission : permissions){
                if(!StringUtils.isEmpty(permission.getName())){
                    authorities.add(new SimpleGrantedAuthority(permission.getName()));
                    //hasRole("管理员") ROLE_管理员
                }
            }
            return new User(name,admin.getUserpswd(),authorities);
        }else{
            return null;
        }
    }

}
