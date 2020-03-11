package com.yan.crowdfunding.controller;

import com.github.pagehelper.PageInfo;
import com.yan.crowdfunding.entity.TAdmin;
import com.yan.crowdfunding.entity.TRole;
import com.yan.crowdfunding.service.TAdminService;
import com.yan.crowdfunding.service.TRoleService;
import com.yan.crowdfunding.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

/**
 * @author
 * @date 2020/3/6 18:31
 */
@Controller
public class TAdminController {

    @Autowired
    TAdminService adminService;
    @Autowired
    TRoleService roleService;

    /**
     * 查询分页数据，并跳到管理员数据列表页面
     * @return
     */
    @RequestMapping("/admin/index")
    public String index(@RequestParam(value = "pageNum",required = false ,defaultValue = "1") Integer pageNum,
                        @RequestParam(value = "pageSize",required = false ,defaultValue = "5") Integer pageSize,
                        String condition ,Model model){


        Map<String,Object> map = new HashMap<>();
        map.put("pageNum",pageNum);
        map.put("pageSize",pageSize);
        map.put("condition",condition);

        PageInfo<TAdmin> pageInfo = adminService.listByLimit(map);
        model.addAttribute("pageInfo",pageInfo);
        return "admin/index";
    }


    /**
     * 跳转到添加页面
     * @return
     */
    @RequestMapping("/admin/addPage")
    public String addPage(){

        return "admin/add";
    }

    /**
     * 获取表单数据，进行保存
     * @return
     */
    @PreAuthorize("hasRole('PM - 项目经理')")
    @RequestMapping("/admin/add")
    public String add(TAdmin admin){
        adminService.saveTAdmin(admin);

        return "redirect:/admin/index";
    }

    /**
     * 跳转到修改页面，进行数据回显
     * @return
     */
    @RequestMapping("/admin/editPage")
    public String editPage(Integer id,Integer pageNum ,Model model){
        TAdmin admin = adminService.findTAdminById(id);
        model.addAttribute("admin",admin);
        return "admin/edit";
    }

    /**
     * 获取表单数据，进行修改
     * @return
     */
    @RequestMapping("/admin/update")
    public String update(TAdmin admin,Integer pageNum){
        adminService.updateTAdmin(admin);
        return "redirect:/admin/index?pageNum=" + pageNum;
    }

    /**
     * 根据id进行删除管理员
     * @param id
     * @return
     */
    @RequestMapping("/admin/delete")
    public String delete(Integer id){
        adminService.deleteTAdminById(id);
        return "redirect:/admin/index";
    }

    /**
     * 批量删除
     * @param ids 要删除的管理员id
     * @return
     */
    @RequestMapping("/admin/deletes")
    public String deletes(Integer[] ids){
        //System.out.println(Arrays.toString(ids));

        adminService.deleteTAdmins(ids);
        return "redirect:/admin/index";
    }

    /**
     * 跳转到角色分配页面
     * @return
     */
    @RequestMapping("/admin/assignPage")
    public String assignPage(Integer id,Model model){
        List<TRole> assign = new ArrayList<>();
        List<TRole> unAssign = new ArrayList<>();
        
        //查询全部角色信息
        List<TRole> roles = roleService.queryAll();
        //查询已分配的角色id
        List<Integer> roledids = adminService.findAssignRoleid(id);
        //获取未分配的角色和已分配的角色
        for(TRole role : roles){
            if(roledids.contains(role.getId())){
                //已分配的角色
                assign.add(role);
            }else{
                //未分配的角色
                unAssign.add(role);
            }
        }
        
        model.addAttribute("assign",assign);
        model.addAttribute("unAssign",unAssign);
        
        return "admin/assignRole";
    }

    /**
     * 给用户分配角色
     * @return
     */
    @ResponseBody
    @RequestMapping("/admin/assignRole")
    public Result assignRole(Integer adminId,Integer[] roleIdLeft){

        try {
            adminService.assignRole(adminId,roleIdLeft);
             return new Result("ok");
        } catch (Exception e) {
            e.printStackTrace();
             return new Result("no");
        }
       
    }

    /**
     * 取消用户分配的角色
     * @return
     */
    @ResponseBody
    @RequestMapping("/admin/unAssignRole")
    public Result unAssignRole(Integer adminId,Integer[] roleIdRight){
        adminService.unAssignRole(adminId,roleIdRight);
        return new Result("ok");
    }
}
