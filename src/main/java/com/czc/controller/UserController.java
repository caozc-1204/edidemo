package com.czc.controller;

import com.czc.domain.User;
import com.czc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

//RestController= @ResponseBody+@Controller
//接收前端来的数据，去调用Service层的方法
//@RestController
@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    UserService userService;

    @ResponseBody
    @RequestMapping("/All")
    public List<User> getAll(Map map){
        return userService.getAll(map);
    }
    //重定向
    @RequestMapping("/DeleteById")
    public String DeleteById(Integer id){
        userService.DeleteById(id);
        //return "删除成功";
        return "redirect:/index.html";
    }
    //新增
    @RequestMapping("/save")
    @ResponseBody
    public String save(@RequestBody User user){
        System.out.println("用户注册" + user);
        userService.save(user);
        return "新增成功";
    }


}
