package wen.tian.it.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import wen.tian.it.model.Category;
import wen.tian.it.service.AdminService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author tianwenwen
 * @date 2019/5/26 16:14
 **/
@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;

    @RequestMapping("/toindex")
    public String testAdmin(HttpServletRequest request) {
        System.out.println(request.getContextPath());
        return "admin/index";
    }
    @RequestMapping("/tocategorylist")
    public String toCategory(Model model) {
        PageHelper.startPage(1,5);

        List<Category> list = adminService.selectCategory();
        PageInfo<Category> pageInfo = new PageInfo<>(list);
        System.out.println(pageInfo);
        System.out.println(pageInfo.getPages());
        System.out.println(pageInfo.getTotal());
        System.out.println(list.size());
        model.addAttribute("categorylist",pageInfo);
        return "admin/category/list";
    }
}
