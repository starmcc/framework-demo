package com.starmcc.demo.framework.controller;

import com.starmcc.qmframework.controller.QmCode;
import com.starmcc.qmframework.controller.QmController;
import com.starmcc.qmframework.redis.QmRedisClient;
import org.springframework.web.bind.annotation.*;

/**
 * @Author starmcc
 * @Date 2020/5/29
 * @Description Redis 示例
 */
@RestController
@RequestMapping("/demo/redis")
public class RedisDemoController extends QmController {


    @GetMapping("/get")
    @ResponseBody
    public String get(@RequestParam String key) {
        Object val = QmRedisClient.get(key);
        return super.sendJSON(QmCode._1, val);
    }

    @GetMapping("/set")
    @ResponseBody
    public String set(@RequestParam String key, @RequestParam String val) {
        boolean is = QmRedisClient.set(key, val, 60000);
        return super.sendJSON(QmCode._1, is);
    }

}
