package com.yan.crowdfunding.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yan.crowdfunding.entity.TRole;
import com.yan.crowdfunding.entity.TRolePermission;
import com.yan.crowdfunding.mapper.TRoleMapper;
import com.yan.crowdfunding.mapper.TRolePermissionMapper;
import com.yan.crowdfunding.service.TRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author
 * @date 2020/3/7 21:25
 */
@Service
public class TRoleServiceImpl implements TRoleService {

    @Autowired
    TRoleMapper roleMapper;
    
    @Autowired
    TRolePermissionMapper rolePermissionMapper;

    @Override
    public PageInfo<TRole> queryLimit(Map<String, Object> map) {
        Integer pageNum = (Integer) map.get("pageNum");
        Integer pageSize = (Integer) map.get("pageSize");

        PageHelper.startPage(pageNum,pageSize);
        List<TRole> roles = roleMapper.queryAll(map);
        PageInfo<TRole> pageInfo = new PageInfo<>(roles);


        return pageInfo;
    }

    @Override
    public void addRole(TRole role) {
        roleMapper.addRole(role);
    }

    @Override
    public TRole queryRoleById(Integer id) {
        return roleMapper.queryRoleById(id);
    }

    @Override
    public void updateRole(TRole role) {
        roleMapper.updateRole(role);
    }

    @Override
    public void deleteTRoleById(Integer id) {
        roleMapper.deleteTRoleById(id);
    }

    @Override
    public void deleteRoles(Integer[] ids) {
        roleMapper.deleteRoles(ids);
    }

    @Override
    public List<TRole> queryAll() {
       return roleMapper.queryAll(new HashMap<>());
    }

    @Override
    public void deleteAssignPermission(Integer roleId) {
        rolePermissionMapper.deleteAssignPermission(roleId);
    }

    @Override
    public void addAssignPermission(Integer roleId, List<Integer> ids) {
        rolePermissionMapper.addAssignPermission(roleId,ids);
    }

    @Override
    public List<Integer> listPermissionIdByRoleId(Integer roleId) {
        return rolePermissionMapper.listPermissionIdByRoleId(roleId);
    }
}
