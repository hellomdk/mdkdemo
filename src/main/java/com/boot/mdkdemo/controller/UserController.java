package com.boot.mdkdemo.controller;

import com.boot.mdkdemo.dao.userMapper;
import com.boot.mdkdemo.entity.User;
import com.boot.mdkdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;



    @Autowired
    private userMapper userMapper;

    @GetMapping("select")
    @ResponseBody
    public String select(){
        User userById = userMapper.getUserById("1");
        return userById.getName();
    }

    @RequestMapping("/hello")
    public String sayHello() {
        return "hello world";
    }

   /* @RequestMapping(name = "/list")
    @ResponseBody
    public List<User> hello(){
        List<User> hello=null;
        try {
            hello = userService.hello( );
        }catch (Exception e){
            System.out.println(e );
        }
        return hello;
    }*/

    @GetMapping("/")
    public String index(){
        return "index.html";
    }

    @RequestMapping(name = "/list1")
    public String hello1(Model model){
        List<User> hellos=null;
        try {
            hellos = userService.hello( );
        }catch (Exception e){
            System.err.println(e );
        }
        model.addAttribute("users",hellos);
        return "/hello";
    }

    @RequestMapping("/hello1")
    public String fun(){
        return "/hello1";
    }

    @RequestMapping("/selectById")
    @ResponseBody
    public String selectById(){
        User user = userService.selectById(2);
        return user.getName();
    }


}
