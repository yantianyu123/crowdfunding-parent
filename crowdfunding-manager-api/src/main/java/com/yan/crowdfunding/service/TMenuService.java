package com.yan.crowdfunding.service;

import com.yan.crowdfunding.entity.TMenu;

import java.util.List;

/**
 * @author
 * @date 2020/3/6 16:35
 */
public interface TMenuService {

    /**
     * 查询全部的菜单栏信息
     * @return
     */
    List<TMenu> listTMenu();
}
