package com.yan.crowdfunding.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yan.crowdfunding.entity.TAdmin;
import com.yan.crowdfunding.excepiton.LoginException;
import com.yan.crowdfunding.mapper.TAdminMapper;
import com.yan.crowdfunding.mapper.TAdminRoleMapper;
import com.yan.crowdfunding.service.TAdminService;
import com.yan.crowdfunding.utils.AppDateUtils;
import com.yan.crowdfunding.utils.Const;
import com.yan.crowdfunding.utils.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author
 * @date 2020/3/6 12:56
 */
@Service
public class TAdminServiceImpl implements TAdminService {

    @Autowired
    TAdminMapper adminMapper;
    
    @Autowired
    TAdminRoleMapper adminRoleMapper;

    @Override
    public TAdmin getTAdminByLogin(Map<String, Object> map) {

        String loginacct = (String) map.get("loginacct");
        String userpswd = (String) map.get("userpswd");

        TAdmin admin = adminMapper.getTAdminByLoginacct(loginacct);

        //判断管理员是否存在
        if( admin == null ) {
            throw new LoginException(Const.LOGIN_LOGINACCT_ERROR);
        }
        //判断密码是否正确
        if( !admin.getUserpswd().equals(MD5Util.digest(userpswd)) ) {
            throw new LoginException(Const.LOGIN_USERPSWD_ERROR);
        }
        //用户存在
        return admin;
    }

    @Override
    public PageInfo<TAdmin> listByLimit(Map<String,Object> map) {
        Integer pageNum = (Integer) map.get("pageNum");
        Integer pageSize = (Integer) map.get("pageSize");

        PageHelper.startPage(pageNum,pageSize);
        List<TAdmin> admins = adminMapper.listTAdmin(map);
        PageInfo<TAdmin> pageInfo = new PageInfo<>(admins);

        return pageInfo;
    }

    @Override
    public void saveTAdmin(TAdmin admin) {
        //分配默认密码
        if(admin.getUserpswd() == null){
            admin.setUserpswd(MD5Util.digest("123456"));
        }
        if(admin.getCreatetime() == null){
            admin.setCreatetime(AppDateUtils.getFormatTime());
        }
        adminMapper.saveTAdmin(admin);
    }

    @Override
    public TAdmin findTAdminById(Integer id) {

       return adminMapper.findTAdminById(id);
    }

    @Override
    public void updateTAdmin(TAdmin admin) {
        adminMapper.updateTAdmin(admin);
    }

    @Override
    public void deleteTAdminById(Integer id) {
        adminMapper.deleteTAdminById(id);
    }

    @Override
    public void deleteTAdmins(Integer[] ids) {
        adminMapper.deleteTAdmins(ids);
    }

    @Override
    public List<Integer> findAssignRoleid(Integer id) {
        return adminRoleMapper.findAssignRoleid(id);
    }

    @Override
    public void assignRole(Integer adminId, Integer[] roleIdLeft) {
        adminRoleMapper.assignRole(adminId,roleIdLeft);
    }

    @Override
    public void unAssignRole(Integer adminId, Integer[] roleIdRight) {
        adminRoleMapper.unAssignRole( adminId, roleIdRight);
    }
}
