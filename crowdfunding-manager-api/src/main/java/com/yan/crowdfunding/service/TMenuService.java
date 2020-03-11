package com.yan.crowdfunding.service;

import com.yan.crowdfunding.entity.TMenu;

import java.util.List;

/**
 * @author
 * @date 2020/3/6 16:35
 */
public interface TMenuService {

    /**
     * 查询全部的菜单栏信息(组合了父子关系)
     * @return
     */
    List<TMenu> listTMenu();

    /**
     * 查询全部的菜单栏信息(没有组合了父子关系)
     * @return
     */
    List<TMenu> queryAll();

    /**
     * 添加菜单信息
     * @param menu
     */
    void addMenu(TMenu menu);

    /**
     * 根据id查询菜单信息
     * @param id
     * @return
     */
    TMenu findTMenuById(Integer id);

    /**
     * 修改菜单信息
     * @param menu
     */
    void updateTMenu(TMenu menu);

    /**
     * 根据id删除菜单信息
     * @param id
     */
    void deleteTMenuById(Integer id);
}
