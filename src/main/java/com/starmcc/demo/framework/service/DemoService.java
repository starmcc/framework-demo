package com.starmcc.demo.framework.service;

import com.starmcc.demo.framework.entity.Student;

import java.util.List;

/**
 * @Author starmcc
 * @Date 2020/5/27
 * @Description 业务层示例
 */
public interface DemoService {

    /**
     * 查询list
     *
     * @param student
     * @return
     */
    List<Student> getList(Student student);

    /***
     * 查询单个对象
     *
     * @param student
     * @return
     */
    Student get(Student student);


    /**
     * 通过Dao - Mapper进行查询
     *
     * @param age
     * @return
     */
    List<Student> getCustomList(Integer age);

}
