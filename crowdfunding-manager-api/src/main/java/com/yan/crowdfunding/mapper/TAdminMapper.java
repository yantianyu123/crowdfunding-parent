package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.TAdmin;

import java.util.List;

/**
 * @author
 * @date 2020/3/6 15:22
 */
public interface TAdminMapper {

    //根据用户名查询管理员信息
    TAdmin getTAdminByLoginacct(String loginacct);

    //查询全部
    List<TAdmin> listTAdmin();

    //添加管理员
    void saveTAdmin(TAdmin admin);

    //根据id查询管理员
    TAdmin findTAdminById(Integer id);

    //修改数据
    void updateTAdmin(TAdmin admin);
}
