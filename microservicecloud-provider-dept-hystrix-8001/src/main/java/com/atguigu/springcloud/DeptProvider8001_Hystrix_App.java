package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author licheng
 * @description
 * @create 2019/3/13 16:32
 */
@EnableEurekaClient
//@EnableDiscoveryClient
@EnableCircuitBreaker//开启对Hystrix熔断器的支持
@SpringBootApplication
public class DeptProvider8001_Hystrix_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8001_Hystrix_App.class, args);
    }
}
