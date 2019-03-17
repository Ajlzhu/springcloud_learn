package com.atguigu.myrlue;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author licheng
 * @description
 * @create 2019/3/14 23:28
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule(){
        return new RoundRobinRule_LC();
    }
}
