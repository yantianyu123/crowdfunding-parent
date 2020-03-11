package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.TPermission;

import java.util.List;

/**
 * @author
 * @date 2020/3/9 19:55
 */
public interface TPermissionMapper {
    
    //查询全部
    List<TPermission> listTPermission();

    //添加权限
    void insertTPermission(TPermission permission);

    //根据id查询权限
    TPermission queryTPermission(Integer id);

    //修改权限信息
    void updateTPermission(TPermission permission);

    //根据id删除权限
    void deleteTPermissionById(Integer id);

    //根据管理员id查询已分配的权限
    List<TPermission> listPermissionByAdminId(Integer id);
}
