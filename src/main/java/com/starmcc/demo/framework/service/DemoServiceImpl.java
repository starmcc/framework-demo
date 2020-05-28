package com.starmcc.demo.framework.service;

import com.starmcc.demo.framework.dao.DemoDao;
import com.starmcc.demo.framework.entity.Student;
import com.starmcc.qmdata.common.QmData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author starmcc
 * @Date 2020/5/27
 * @Description 业务层实现示例
 */
@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    private QmData qmData;

    @Autowired
    private DemoDao demoDao;


    @Override
    public List<Student> getList(Student student) {
        return qmData.autoSelectList(student, Student.class);
    }

    @Override
    public Student get(Student student) {
        return qmData.autoSelectOne(student, Student.class);
    }

    @Override
    public List<Student> getCustomList(Integer age) {
        return demoDao.getCustomListByMapper(age);
    }
}
