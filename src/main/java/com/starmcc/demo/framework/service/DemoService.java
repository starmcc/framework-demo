package com.starmcc.demo.framework.service;

import com.starmcc.demo.framework.entity.Student;

import java.util.List;

/**
 * @Author starmcc
 * @Date 2020/5/27
 * @Description 业务层示例
 */
public interface DemoService {


    List<Student> getList(Student student);

}
