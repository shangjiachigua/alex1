package wen.tian.it.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import wen.tian.it.model.User;
import wen.tian.it.service.TestService;

@Controller
@RequestMapping("/test")
public class TestController {
    @Autowired
    private TestService testService;

    @RequestMapping("/test")
    @ResponseBody
    public User test(String uid){
        return testService.selectUser(uid);
    }
}
