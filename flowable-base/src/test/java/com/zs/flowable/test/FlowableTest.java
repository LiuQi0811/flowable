package com.zs.flowable.test;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.flowable.engine.ProcessEngine;
import org.flowable.engine.ProcessEngineConfiguration;
import org.flowable.engine.impl.cfg.StandaloneProcessEngineConfiguration;
import org.junit.Test;

/*
 *@ClassName FlowableTest
 *@Description FlowableTest
 *@Author LiuQi
 *@Date 2023/2/14 22:58
 *@Version 1.0
 */
@Slf4j
public class FlowableTest {
    /**
     * 获取流程引擎对象
     */
    @Test
    public static void getProcessEngine(){
        // 创建 ProcessEngineConfiguration 对象
        ProcessEngineConfiguration configuration = new StandaloneProcessEngineConfiguration();
        // 数据库连接配置相关
        configuration.setJdbcDriver("com.mysql.cj.jdbc.Driver");
        // 通过 ProcessEngineConfiguration实例 构建processEngine对象
        ProcessEngine processEngine = configuration.buildProcessEngine();
    }
}
