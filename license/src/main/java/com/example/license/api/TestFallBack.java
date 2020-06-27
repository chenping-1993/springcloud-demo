package com.example.license.api;

import com.example.license.entity.User;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description: 若是调用organizationservice服务接口失败，调用TestCallBack类中相同的接口方法
 * @Author: chenping
 * @Date: 2020-05-08
 */
@Component
@RequestMapping("/error")
public class TestFallBack implements TestApi{
    @Override
    public User hello() {
        return null;
    }
}
