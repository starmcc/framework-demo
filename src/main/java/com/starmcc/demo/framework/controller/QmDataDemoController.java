package com.starmcc.demo.framework.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.starmcc.demo.framework.entity.Student;
import com.starmcc.demo.framework.service.DemoService;
import com.starmcc.qmframework.controller.QmCode;
import com.starmcc.qmframework.controller.QmController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description 示例Controller
 * @Author starmcc
 * @Date 2020/5/27
 */
@RestController
@RequestMapping("/demo/qm_data")
public class QmDataDemoController extends QmController {


    @Autowired
    private DemoService demoService;


    /**
     * 获取学生列表
     *
     * @param name
     * @return
     */
    @GetMapping("/get_student_list")
    @ResponseBody
    public String getStudentList(Integer page, Integer size) {
        PageHelper.startPage(page, size);
        List<Student> list = demoService.getList(null);
        PageInfo<Student> pageInfo = new PageInfo<>(list);
        return super.sendJSON(QmCode._1, pageInfo);
    }


}
