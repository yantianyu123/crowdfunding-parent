package com.yan.crowdfunding.service.impl;

import com.yan.crowdfunding.entity.TMenu;
import com.yan.crowdfunding.mapper.TMenuMapper;
import com.yan.crowdfunding.service.TMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @author
 * @date 2020/3/6 16:36
 */
@Service
public class TMenuServiceImpl implements TMenuService {

    @Autowired
    TMenuMapper menuMapper;

    @Override
    public List<TMenu> listTMenu() {
        List<TMenu> menus = menuMapper.listTMenu();
        Map<Integer,TMenu> map = new HashMap<>();

        List<TMenu> parents = new ArrayList<>();

        //将父菜单放到map中。id为键，对象为值
        for(TMenu menu : menus){
            if(menu.getPid() == 0){
                map.put(menu.getId(),menu);
                parents.add(menu);
            }
        }



        //取得所有的子菜单
        for(TMenu menu : menus){
            if(menu.getPid() != 0){
                TMenu parent = map.get(menu.getPid());
                parent.getChildren().add(menu);

            }
        }

        return parents;
    }
}
