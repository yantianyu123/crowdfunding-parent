package com.yan.crowdfunding.service;

import com.github.pagehelper.PageInfo;
import com.yan.crowdfunding.entity.TAdmin;

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
}
