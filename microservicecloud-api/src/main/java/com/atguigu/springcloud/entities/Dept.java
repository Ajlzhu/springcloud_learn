package com.atguigu.springcloud.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author licheng
 * @description
 * @create 2019/3/13 11:48
 */
@Data
@Accessors(chain=true)  //链式风格访问
@NoArgsConstructor
public class Dept implements Serializable {

    /*部门编号*/
   private Long deptno;
   /*部门名称*/
   private String dname;
   /*来自哪个数据库：微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同的数据库*/
   private String db_source;

    public Dept(String dname) {
        super();
        this.dname = dname;
    }
}
