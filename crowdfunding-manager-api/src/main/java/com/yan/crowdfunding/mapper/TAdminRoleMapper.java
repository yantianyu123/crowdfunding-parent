package com.yan.crowdfunding.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author
 * @date 2020/3/10 13:56
 */
public interface TAdminRoleMapper {
    
    //根据用户id查询已分配的角色id
    List<Integer> findAssignRoleid(Integer id);

    //给用户分配角色
    void assignRole(@Param("adminId") Integer adminId, @Param("roleIds") Integer[] roleIdLeft);

    //取消用户分配的角色
    void unAssignRole(@Param("adminId") Integer adminId,@Param("roleIds") Integer[] roleIdRight);
}
