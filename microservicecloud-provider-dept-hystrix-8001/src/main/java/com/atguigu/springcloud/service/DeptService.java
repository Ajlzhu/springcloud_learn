package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Dept;

import java.util.List;

/**
 * @author licheng
 * @description
 * @create 2019/3/13 16:15
 */
public interface DeptService {

    boolean add(Dept dept);

    Dept get(Long deptno);

    List<Dept> list();

}
