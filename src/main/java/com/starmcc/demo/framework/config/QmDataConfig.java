package com.starmcc.demo.framework.config;

import com.starmcc.qmdata.common.QmData;
import com.starmcc.qmdata.common.QmDataFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author starmcc
 * @Date 2020/5/27
 * @Description qm-data 配置类
 */
@Configuration
public class QmDataConfig {

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    @Bean
    public QmData initQmData() {
        // 使用QmDataFactory.createInstance 构建 QmData实例交由Spring管理
        return QmDataFactory.createInstance(sqlSessionTemplate);
    }
}