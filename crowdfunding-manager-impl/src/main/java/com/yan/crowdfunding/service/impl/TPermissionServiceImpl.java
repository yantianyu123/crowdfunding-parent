package com.yan.crowdfunding.service.impl;

import com.yan.crowdfunding.entity.TPermission;
import com.yan.crowdfunding.mapper.TPermissionMapper;
import com.yan.crowdfunding.service.TPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author
 * @date 2020/3/9 19:56
 */
@Service
public class TPermissionServiceImpl implements TPermissionService {
    
    @Autowired
    TPermissionMapper permissionMapper;
    
    @Override
    public List<TPermission> listTPermission() {
        return permissionMapper.listTPermission();
    }

    @Override
    public void insertTPermission(TPermission permission) {
        permissionMapper.insertTPermission(permission);
    }

    @Override
    public TPermission queryTPermission(Integer id) {
        return permissionMapper.queryTPermission(id);
    }

    @Override
    public void updateTPermission(TPermission permission) {
        permissionMapper.updateTPermission(permission);
    }

    @Override
    public void deleteTPermissionById(Integer id) {
        permissionMapper.deleteTPermissionById(id);
    }
}
