package com.yan.crowdfunding.controller;

import com.github.pagehelper.PageInfo;
import com.sun.org.apache.xpath.internal.operations.Mod;
import com.yan.crowdfunding.entity.TAdmin;
import com.yan.crowdfunding.service.TAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

/**
 * @author
 * @date 2020/3/6 18:31
 */
@Controller
public class TAdminController {

    @Autowired
    TAdminService adminService;

    /**
     * 查询分页数据，并跳到管理员数据列表页面
     * @return
     */
    @RequestMapping("/admin/index")
    public String index(@RequestParam(value = "pageNum",required = false ,defaultValue = "1") Integer pageNum,
                        @RequestParam(value = "pageSize",required = false ,defaultValue = "5") Integer pageSize, Model model){
        Map<String,Object> map = new HashMap<>();
        map.put("pageNum",pageNum);
        map.put("pageSize",pageSize);

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
    public String editPage(Integer id,Model model){
        TAdmin admin = adminService.findTAdminById(id);
        model.addAttribute("admin",admin);
        return "admin/edit";
    }

    /**
     * 获取表单数据，进行修改
     * @return
     */
    @RequestMapping("/admin/update")
    public String update(TAdmin admin){
        adminService.updateTAdmin(admin);
        return "redirect:/admin/index";
    }
}
