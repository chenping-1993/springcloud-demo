package com.example.server.controller;

import com.example.server.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: chenping
 * @Date: 2019/4/25
 */
@RestController
public class Hello {
    @GetMapping("/hello")
    public User hello() {
        User user = new User();
        user.setAge("66");
        user.setName("abcd");
        return user;
    }


}
