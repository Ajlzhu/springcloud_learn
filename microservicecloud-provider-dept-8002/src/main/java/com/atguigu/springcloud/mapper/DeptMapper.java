package com.atguigu.springcloud.mapper;

import com.atguigu.springcloud.entities.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author licheng
 * @description
 * @create 2019/3/13 14:46
 */
@Mapper
public interface DeptMapper {

    boolean addDept(Dept dept);

    Dept findById(Long deptno);

    List<Dept> findAll();

}
