package com.example.springboot.controller;

import com.example.springboot.po.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 71051
 */
@RestController
@RequestMapping("/user")
public class UserControllerTest {

    @RequestMapping("/test")
    public @ResponseBody
    User test(String id){
        User user = new User(id,"张三","123456");
        return user;
    }
}
