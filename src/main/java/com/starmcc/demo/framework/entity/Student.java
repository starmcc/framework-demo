package com.starmcc.demo.framework.entity;

import com.starmcc.qmdata.note.Id;
import com.starmcc.qmdata.note.Table;

import java.io.Serializable;

/**
 * @Author starmcc
 * @Date 2020/5/27
 * @Description 实体类 qm-data 示例
 */
@Table(name = "student")
public class Student {

    @Id
    private Long id;
    private String name;
    private Integer age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
