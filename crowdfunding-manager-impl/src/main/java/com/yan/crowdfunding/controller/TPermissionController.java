package com.yan.crowdfunding.controller;

import com.yan.crowdfunding.entity.TPermission;
import com.yan.crowdfunding.service.TPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author
 * @date 2020/3/9 18:09
 */
@Controller
public class TPermissionController {

    @Autowired
    TPermissionService permissionService;

    /**
     * 权限维护页面
     * @return
     */
    @RequestMapping("/permission/index")
    public String index(){
        
        return "permission/index";
    }

    /**
     * 查询所有的权限信息
     * @return
     */
    @ResponseBody
    @RequestMapping("/permission/loadData")
    public List<TPermission> loadData(){
        List<TPermission> permissions = permissionService.listTPermission();
        return permissions;
    }

    /**
     * 添加权限信息
     * @param permission 
     */
    @ResponseBody
    @RequestMapping("/permission/add")
    public void add(TPermission permission){
        permissionService.insertTPermission(permission);
    }

    /**
     * 根据id查询权限信息
     * @param id 要查询权限的id
     * @return
     */
    @ResponseBody
    @RequestMapping("/permission/query")
    public TPermission query(Integer id){
       TPermission permission =  permissionService.queryTPermission(id);
       return permission;
    }

    /**
     * 修改权限信息
     * @param permission
     */
    @ResponseBody
    @RequestMapping("/permission/update")
    public void update(TPermission permission){
        permissionService.updateTPermission(permission);
    }

    /**
     * 根据id删除权限
     * @param id 要删除权限的id
     */
    @ResponseBody
    @RequestMapping("/permission/delete")
    public void delete(Integer id){
        permissionService.deleteTPermissionById(id);
    }
}
