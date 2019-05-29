package wen.tian.it.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import wen.tian.it.model.User;
import wen.tian.it.service.TestService;

import java.util.List;

@Controller
@RequestMapping("/test")
public class TestController {
    @Autowired
    private TestService testService;

    @RequestMapping("/test")
    @ResponseBody
    public User test(String uid) {
        return testService.selectUser(uid);
    }

    @RequestMapping("/testjsp")
    public String test1(Model model) {
        List<User> list = testService.selectAllUser();
        model.addAttribute("user", list);
        for (User user : list) {
            System.out.println(user);
        }
        return "/login.jsp";
    }




}
