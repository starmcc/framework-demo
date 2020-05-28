package com.starmcc.demo.framework.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.starmcc.demo.framework.entity.Student;
import com.starmcc.demo.framework.service.DemoService;
import com.starmcc.qmframework.controller.QmCode;
import com.starmcc.qmframework.controller.QmController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
     * 获取学生列表（分页示例，使用pageHelper进行物理分页查询）
     *
     * @param name
     * @return
     */
    @GetMapping("/get_student_list")
    @ResponseBody
    public String getStudentList(@RequestParam Integer page, @RequestParam Integer size) {
        PageHelper.startPage(page, size);
        List<Student> list = demoService.getList(null);
        PageInfo<Student> pageInfo = new PageInfo<>(list);
        return super.sendJSON(QmCode._1, pageInfo);
    }


    /**
     * 获取学生列表（使用自定义的SQL映射Dao进行查询）
     *
     * @param name
     * @return
     */
    @GetMapping("/search_student")
    @ResponseBody
    public String searchStudent(@RequestParam String name) {
        Student query = new Student();
        query.setName(name);
        Student student = demoService.get(query);
        return super.sendJSON(QmCode._1, student);
    }


    /**
     * 获取学生列表（分页示例，使用pageHelper进行物理分页查询）
     *
     * @param name
     * @return
     */
    @GetMapping("/get_custom_list")
    @ResponseBody
    public String getCustomList(@RequestParam Integer age) {
        List<Student> customList = demoService.getCustomList(age);
        return super.sendJSON(QmCode._1, customList);
    }

}
