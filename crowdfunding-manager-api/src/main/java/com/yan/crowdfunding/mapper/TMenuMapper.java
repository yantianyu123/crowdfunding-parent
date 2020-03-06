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
}
