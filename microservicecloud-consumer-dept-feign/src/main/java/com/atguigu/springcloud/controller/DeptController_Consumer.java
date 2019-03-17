package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.Dept;
import com.atguigu.springcloud.service.DeptClientService;
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

    @Autowired
    private DeptClientService deptClientService;

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping("/consumer/dept/add")
    public boolean add(Dept dept){
        return deptClientService.add(dept);
    }

    @GetMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long deptno){
        return deptClientService.get(deptno);
    }
    @GetMapping("/consumer/dept/list")
    public List<Dept> list(){
        return deptClientService.list();
    }
}
