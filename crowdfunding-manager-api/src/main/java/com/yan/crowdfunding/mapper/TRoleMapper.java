package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.TRole;

import java.util.List;
import java.util.Map;

/**
 * @author
 * @date 2020/3/7 21:24
 */
public interface TRoleMapper {


    //查询全部角色
    List<TRole> queryAll(Map<String, Object> map);

    //添加角色
    void addRole(TRole role);

    //根据id查询角色
    TRole queryRoleById(Integer id);

    //修改角色信息
    void updateRole(TRole role);

    //根据id删除角色信息
    void deleteTRoleById(Integer id);

    //根据id批量删除角色
    void deleteRoles(Integer[] ids);

    //根据管理员id查询拥有的角色
    List<TRole> listRoleByAdminId(Integer id);
}
