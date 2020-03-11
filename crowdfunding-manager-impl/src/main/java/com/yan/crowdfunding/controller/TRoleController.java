package com.yan.crowdfunding.controller;

import com.github.pagehelper.PageInfo;
import com.yan.crowdfunding.entity.TRole;
import com.yan.crowdfunding.service.TRoleService;
import com.yan.crowdfunding.utils.Datas;
import com.yan.crowdfunding.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author
 * @date 2020/3/7 21:21
 */
@Controller
public class TRoleController {

    @Autowired
    TRoleService roleService;

    /**
     * 跳转到角色展示页面
     * @return
     */
    @RequestMapping("/role/index")
    public String index(){

        return "role/index";
    }


    /**
     * 异步请求，加载分页数据
     * @param pageNum 页码
     * @param pageSize 每页数据数量
     */
    @ResponseBody
    @RequestMapping("/role/showData")
    public PageInfo<TRole> showData(@RequestParam(value = "pageNum",required = false,defaultValue = "1") Integer pageNum,
                                    @RequestParam(value = "pageSize",required = false,defaultValue = "5") Integer pageSize,String condition){


        Map<String,Object> map = new HashMap<>();
        map.put("pageNum",pageNum);
        map.put("pageSize",pageSize);
        map.put("condition",condition);

        PageInfo<TRole> pageInfo = roleService.queryLimit(map);

        return pageInfo;
    }

    /**
     * 添加角色
     * @param role 添加的角色信息
     * @return
     */
    @PreAuthorize("hasRole('PM - 项目经理')")
    @ResponseBody
    @RequestMapping("/role/add")
    public Result add(TRole role){
        try {
            roleService.addRole(role);

            return new Result("ok");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result("no");
        }
    }

    /**
     * 根据id查询角色信息
     * @param id 要查询角色的id
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/role/query",method = RequestMethod.POST)
    public TRole query(Integer id){
        TRole role = roleService.queryRoleById(id);
        return  role;
    }

    /**
     * 修改角色信息
     * @param role 修改后的角色信息
     * @return
     */
    @ResponseBody
    @RequestMapping("/role/update")
    public Result update(TRole role){
        try {
            roleService.updateRole(role);
            return new Result("ok");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result("no");
        }
    }


    /**
     * 根据id删除角色
     * @param id 要删除角色的id
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/role/delete",method = RequestMethod.POST)
    public Result delete(Integer id){

        try {
            roleService.deleteTRoleById(id);
            return new Result("ok");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result("no");
        }
    }

    /**
     * 根据id批量删除角色
     * @param ids
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/role/deletes",method = RequestMethod.POST)
    public Result deletes(Integer[] ids){

        roleService.deleteRoles(ids);
        return null;
    }

    /**
     * 跳转到分配权限页面
     * @return
     */
    @RequestMapping("/role/assignPage")
    public String assignPage(Integer id){
        
        return "role/assignPermission";
    }

    /**
     * 给角色分配全选
     * @param roleId 角色id
     * @param datas 为分配的全选id集合类
     * @return
     */
    @ResponseBody
    @RequestMapping("/role/assignPermission")
    public Result assignPermission(Integer roleId, Datas datas){
        //每次分配前，先把之前分配的权限都删除
        roleService.deleteAssignPermission(roleId);
        //在保存新分配的权限
        roleService.addAssignPermission(roleId, datas.getIds());
        return new Result("ok");
    }

    /**
     * 根据角色id查询已分配权限id
     * @param roleId
     * @return
     */
    @ResponseBody
    @RequestMapping("/role/queryAssignPermissionId")
    public List<Integer> queryAssignPermissionId(Integer roleId){
        
        return roleService.listPermissionIdByRoleId(roleId);
    }
}
