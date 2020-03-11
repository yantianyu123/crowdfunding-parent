package com.yan.crowdfunding.mapper;

import com.yan.crowdfunding.entity.TMenu;

import java.util.List;

/**
 * @author
 * @date 2020/3/6 16:37
 */
public interface TMenuMapper {

    //查询全部的TMenu信息
    List<TMenu> listTMenu();

    //添加菜单信息
    void addMenu(TMenu menu);

    //查询一个菜单信息
    TMenu getTMenu(Integer id);

    //修改菜单信息
    void updateTMenu(TMenu menu);

    //根据id删除菜单信息
    void deleteTMenuById(Integer id);
}
