package com.yan.crowdfunding.service;

import com.github.pagehelper.PageInfo;
import com.yan.crowdfunding.entity.TAdmin;

import java.util.List;
import java.util.Map;

/**
 * @author
 * @date 2020/3/6 12:30
 */
public interface TAdminService {

    /**
     * 根据登陆的信息查找管理员
     * @param map 登陆的用户密码
     * @return 查找到的管理员信息
     */
    TAdmin getTAdminByLogin(Map<String,Object> map);

    /**
     * 根据分页信息查找一页数据
     * @return
     */
    PageInfo<TAdmin> listByLimit(Map<String,Object> map);

    /**
     * 添加管理员
     * @param admin
     */
    void saveTAdmin(TAdmin admin);

    /**
     * 根据id查询管理员信息
     * @param id 管理员id
     * @return 管理员信息
     */
    TAdmin findTAdminById(Integer id);

    /**
     * 修改指定的数据
     * @param admin 修改的数据
     */
    void updateTAdmin(TAdmin admin);

    /**
     * 根据id删除管理员
     * @param id 要删除的管理员id
     */
    void deleteTAdminById(Integer id);

    /**
     * 根据id批量删除管理员
     * @param ids 要删除的管理员id
     */
    void deleteTAdmins(Integer[] ids);

    /**
     * 查询已分配角色的id
     * @param id 根据用户id查询
     * @return
     */
    List<Integer> findAssignRoleid(Integer id);

    /**
     * 给用户分配角色
     * @param adminId 用户id
     * @param roleIdLeft 未分配角色id
     */
    void assignRole(Integer adminId, Integer[] roleIdLeft);

    /**
     * 给用户取消分配的角色
     * @param adminId 用户id
     * @param roleIdRight 已分配角色id
     */
    void unAssignRole(Integer adminId, Integer[] roleIdRight);
}
