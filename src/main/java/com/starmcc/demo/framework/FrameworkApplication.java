package com.starmcc.demo.framework;

import com.starmcc.qmframework.aop.QmControllerAgentAgency;
import com.starmcc.qmframework.config.QmFrameworkApplication;
import com.starmcc.qmframework.exception.QmExceptionHandler;
import com.starmcc.qmframework.redis.QmRedisConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;


/**
 * @Author starmcc
 * @Date 2020/5/27
 * @Description 启动类示例
 */
@SpringBootApplication
@Import({
        QmFrameworkApplication.class,
        QmExceptionHandler.class,
        QmControllerAgentAgency.class,
//        QmRedisConfig.class,
})
@MapperScan("com.starmcc.demo.framework.dao")
public class FrameworkApplication {

    public static void main(String[] args) {
        SpringApplication.run(FrameworkApplication.class, args);
    }

}
