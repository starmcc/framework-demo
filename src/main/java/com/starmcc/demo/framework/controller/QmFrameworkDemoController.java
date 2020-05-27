package com.starmcc.demo.framework.controller;

import com.starmcc.qmframework.body.QmBody;
import com.starmcc.qmframework.controller.QmCode;
import com.starmcc.qmframework.controller.QmController;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description 示例Controller
 * @Author starmcc
 * @Date 2020/5/27
 */
@RestController
@RequestMapping("/demo/framework")
public class QmFrameworkDemoController extends QmController {

    /**
     * 获取学生列表
     *
     * @param name
     * @return
     */
    @GetMapping("/get_request")
    @ResponseBody
    public String getRequest(@RequestParam Integer page,@RequestParam Integer size) {
        Map<String, Object> params = new HashMap<>(16);
        params.put("page", page);
        params.put("size", size);
        return super.sendJSON(QmCode._1, params);
    }


    /**
     * 获取学生列表
     *
     * @param name
     * @return
     */
    @PostMapping("/get_request")
    @ResponseBody
    public String getRequestPost(@QmBody Integer page,@QmBody Integer size) {
        Map<String, Object> params = new HashMap<>(16);
        params.put("page", page);
        params.put("size", size);
        return super.sendJSON(QmCode._1, params);
    }


}
