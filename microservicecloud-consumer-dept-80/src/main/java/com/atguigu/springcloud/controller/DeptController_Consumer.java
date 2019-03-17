package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author licheng
 * @description
 * @create 2019/3/13 20:34
 */
@RestController
public class DeptController_Consumer {

    //private static final String REST_URL_PREFIX = "http://localhost:8001";
    private static final String REST_URL_PREFIX = "http://MICROSERVICECLOUD-DEPT";

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping("/consumer/dept/add")
    public boolean add(Dept dept){
        Boolean bool = restTemplate.postForObject(REST_URL_PREFIX + "/dept/add", dept, Boolean.class);
        return bool;
    }

    @GetMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long deptno){
        Dept dept = restTemplate.getForObject(REST_URL_PREFIX + "/dept/get/"+deptno, Dept.class);
        return dept;
    }
    @GetMapping("/consumer/dept/list")
    public List<Dept> list(){
        List<Dept> deptList = restTemplate.getForObject(REST_URL_PREFIX + "/dept/list", List.class);
        return deptList;
    }
    @GetMapping(value = "/consumer/dept/discovery")
    public Object discovery() {
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/discovery",Object.class);
    }
}
