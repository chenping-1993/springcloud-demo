package com.example.license.service;

import com.example.license.api.TestApi;
import com.example.license.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: chenping
 * @Date: 2019/4/25
 */
@Service
public class TestService {
    @Autowired
    TestApi testApi;

    public User hello() {
        return testApi.hello();
    }
}
