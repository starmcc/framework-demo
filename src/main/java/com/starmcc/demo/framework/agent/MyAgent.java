package com.starmcc.demo.framework.agent;

import com.alibaba.fastjson.JSON;
import com.starmcc.qmframework.aop.QmControllerAgent;
import org.aspectj.lang.JoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class MyAgent implements QmControllerAgent {

    private static final Logger LOG = LoggerFactory.getLogger(MyAgent.class);

    @Override
    public void before(JoinPoint jp) {
        // 当进入接口时，调用该方法。
        LOG.debug("进入MyAgent的before方法，参数JoinPoint：{}", JSON.toJSONString(jp));
    }

    @Override
    public void afterReturning(JoinPoint jp, Object result, Long responseTime) {
        // 当接口返回数据时，调用该方法。
        LOG.debug("进入MyAgent的afterReturning方法，参数JoinPoint：{}, Object: {}, responseTime", JSON.toJSONString(jp), result, responseTime);
    }
}