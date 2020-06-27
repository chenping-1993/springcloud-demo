package com.example.license.api;

import com.example.license.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * TestCallBack--若是调用organizationservice服务接口失败，调用TestCallBack类中相同的接口方法
 * @Author: chenping
 * @Date: 2019/4/25
 */
@FeignClient(name = "organizationservice",fallback = TestFallBack.class)
public interface TestApi {
    @GetMapping("/hello")
    User hello();

}
