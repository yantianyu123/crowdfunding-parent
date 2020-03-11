package com.yan.crowdfunding.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author
 * @date 2020/3/10 17:31
 */
public interface TRolePermissionMapper {
    
    //根据角色id删除权限
    void deleteAssignPermission(Integer roleId);

    //为角色分配权限
    void addAssignPermission(@Param("roleId") Integer roleId,@Param("ids") List<Integer> ids);

    //根据角色id查询已分配权限id
    List<Integer> listPermissionIdByRoleId(Integer roleId);
}
