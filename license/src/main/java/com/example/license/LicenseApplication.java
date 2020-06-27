package com.example.license;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 接口应用
 * 发现 server 服务，调用 server服务应用的api
 * 不处理逻辑业务
 * 对外提供接口
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class LicenseApplication {

    public static void main(String[] args) {
        SpringApplication.run(LicenseApplication.class, args);
    }

}
