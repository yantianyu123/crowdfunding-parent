package com.yan.crowdfunding.controller;

import com.yan.crowdfunding.entity.TMenu;
import com.yan.crowdfunding.service.TMenuService;
import com.yan.crowdfunding.utils.Const;
import com.yan.crowdfunding.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author
 * @date 2020/3/8 23:15
 */
@Controller
public class TMenuController {

    @Autowired
    TMenuService menuService;

    /**
     * 跳转到菜单维护页面
     * @return
     */
    @RequestMapping("/menu/index")
    public String index(){
        return "menu/index";
    }


    /**
     * 查询全部的菜单信息
     * @return
     */
    @ResponseBody
    @RequestMapping("/menu/loadData")
    public List<TMenu> loadData(){
        List<TMenu> menus = menuService.queryAll();
        return menus;
    }

    /**
     * 添加菜单信息
     * @param menu 菜单信息
     * @return
     */
    @ResponseBody
    @RequestMapping("/menu/addMenu")
    public Result addMenu(TMenu menu,HttpSession session){
        try {
            menuService.addMenu(menu);
            session.removeAttribute(Const.MENUS);
            List<TMenu> menus = menuService.listTMenu();
            session.setAttribute(Const.MENUS,menus);
            
            return new Result("ok");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result("no");
        }
    }

    /**
     * 根据id查询菜单信息
     * @param id 要查询的菜单id
     * @return
     */
    @ResponseBody
    @RequestMapping("/menu/query")
    public TMenu query(Integer id){
        TMenu menu = menuService.findTMenuById(id);
        return menu;
    }

    /**
     * 修改菜单信息
     * @param menu 修改后的菜单信息
     */
    @ResponseBody
    @RequestMapping("/menu/update")
    public void update(TMenu menu,HttpSession session){
        menuService.updateTMenu(menu);
        session.removeAttribute(Const.MENUS);
        List<TMenu> menus = menuService.listTMenu();
        session.setAttribute(Const.MENUS,menus);
    }

    /**
     * 根据id删除菜单信息
     * @param id 要删除菜单的id
     */
    @ResponseBody
    @RequestMapping("/menu/delete")
    public void delete(Integer id,HttpSession session){
        menuService.deleteTMenuById(id);
        
        session.removeAttribute(Const.MENUS);
        List<TMenu> menus = menuService.listTMenu();
        session.setAttribute(Const.MENUS,menus);
    }
}
