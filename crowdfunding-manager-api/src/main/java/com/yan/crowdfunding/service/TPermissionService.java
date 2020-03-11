package com.yan.crowdfunding.service;

import com.yan.crowdfunding.entity.TPermission;

import java.util.List;

/**
 * @author
 * @date 2020/3/9 19:54
 */
public interface TPermissionService {

    /**
     * 查询全部权限信息
     * @return
     */
    List<TPermission> listTPermission();

    /**
     * 
     * @param permission
     */
    void insertTPermission(TPermission permission);

    /**
     * 根据id查询权限信息
     * @param id 要查询的权限id
     * @return
     */
    TPermission queryTPermission(Integer id);

    /**
     * 修改权限信息
     * @param permission 修改的权限信息
     */
    void updateTPermission(TPermission permission);

    /**
     * 根据id删除权限
     * @param id 要删除权限的id
     */
    void deleteTPermissionById(Integer id);
}
