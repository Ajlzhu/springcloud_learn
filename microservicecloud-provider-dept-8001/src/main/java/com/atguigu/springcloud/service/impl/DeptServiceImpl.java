package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.entities.Dept;
import com.atguigu.springcloud.mapper.DeptMapper;
import com.atguigu.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author licheng
 * @description
 * @create 2019/3/13 16:16
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper;

    @Override
    public boolean add(Dept dept) {
        return deptMapper.addDept(dept);
    }

    @Override
    public Dept get(Long deptno) {
        return deptMapper.findById(deptno);
    }

    @Override
    public List<Dept> list() {
        return deptMapper.findAll();
    }
}
