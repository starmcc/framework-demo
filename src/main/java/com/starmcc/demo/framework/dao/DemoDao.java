package com.starmcc.demo.framework.dao;

import com.starmcc.demo.framework.entity.Student;

import java.util.List;

/**
 * @Author starmcc
 * @Date 2020/5/28
 * @Description
 */
public interface DemoDao {

    List<Student> getCustomListByMapper(Integer age);


}
