package com.yan.crowdfunding.service;

import com.github.pagehelper.PageInfo;
import com.yan.crowdfunding.entity.TRole;

import java.util.List;
import java.util.Map;

/**
 * @author
 * @date 2020/3/7 21:23
 */
public interface TRoleService {


    /**
     * 分页查询数据
     * @param map 分页的信息
     * @return
     */
    PageInfo<TRole> queryLimit(Map<String, Object> map);

    /**
     * 添加角色
     * @param role
     */
    void addRole(TRole role);

    /**
     * 根据id查询角色
     * @param id 要查询角色的id
     * @return
     */
    TRole queryRoleById(Integer id);

    /**
     * 修改角色信息
     * @param role
     */
    void updateRole(TRole role);

    /**
     * 根据id删除角色信息
     * @param id 要删除角色的id
     */
    void deleteTRoleById(Integer id);

    /**
     * 根据id批量删除角色
     * @param ids
     */
    void deleteRoles(Integer[] ids);

    /**
     * 查询全部的角色信息
     * @return
     */
    List<TRole> queryAll();

    /**
     * 根据角色id删除权限
     * @param roleId
     */
    void deleteAssignPermission(Integer roleId);

    /**
     * 为角色分配权限
     * @param roleId 要分配的角色id
     * @param ids 权限id
     */
    void addAssignPermission(Integer roleId, List<Integer> ids);

    /**
     * 根据角色id查询已分配权限id
     * @param roleId
     * @return
     */
    List<Integer> listPermissionIdByRoleId(Integer roleId);
}
