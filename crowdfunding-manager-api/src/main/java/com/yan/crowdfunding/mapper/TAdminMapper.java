package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.TAdmin;

import java.util.List;
import java.util.Map;

/**
 * @author
 * @date 2020/3/6 15:22
 */
public interface TAdminMapper {

    //根据用户名查询管理员信息
    TAdmin getTAdminByLoginacct(String loginacct);

    //查询全部
    List<TAdmin> listTAdmin(Map<String,Object> map);

    //添加管理员
    void saveTAdmin(TAdmin admin);

    //根据id查询管理员
    TAdmin findTAdminById(Integer id);

    //修改数据
    void updateTAdmin(TAdmin admin);

    //根据id删除管理员
    void deleteTAdminById(Integer id);

    //根据id批量删除管理员
    void deleteTAdmins(Integer[] ids);

    //根据账号查询管理员
    TAdmin findTadminByLoginacct(String name);
}
