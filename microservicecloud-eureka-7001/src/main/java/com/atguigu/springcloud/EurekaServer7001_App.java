package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author licheng
 * @description
 * @create 2019/3/13 21:26
 */
//开启Eureka服务注册功能，接受其他服务注册进来
@EnableEurekaServer
@SpringBootApplication
public class EurekaServer7001_App {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7001_App.class, args);
    }
}
