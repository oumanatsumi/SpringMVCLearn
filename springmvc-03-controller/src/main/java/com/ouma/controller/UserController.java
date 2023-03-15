package com.ouma.controller;

import com.ouma.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
//@RequestMapping("/user")
public class UserController {

    @GetMapping("/t1")
    public String test1(@RequestParam("username") String name, Model model){
        System.out.println("receive param :" + name);
        model.addAttribute("msg", name);
        return "test";
    }

    @GetMapping("/t2")
    public String test2(User user, Model model){
        System.out.println("receive param :" + user);
        model.addAttribute("msg", user.toString());
        return "test";
    }

    @RequestMapping("/e/t")
    public String test(Model model,String name){
        model.addAttribute("msg",name); //获取表单提交的值
        return "test"; //跳转到test页面显示输入的值
    }
}
