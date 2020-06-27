package com.example.license.controller;

import com.example.license.entity.User;
import com.example.license.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: chenping
 * @Date: 2019/4/25
 */
@RestController
public class TestController {
    @Autowired
    TestService testService;

    @GetMapping("/hello")
    public User hello() {
        return testService.hello();
    }

}
