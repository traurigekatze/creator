package com.kerry.creator.controller;

import com.kerry.creator.service.TestService;
import com.kerry.creator.service.impl.TestServiceImpl1;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * **********书山有路勤为径**********
 *
 * @author k1rry
 * @date 2020/3/28
 * **********学海无涯苦作舟**********
 */
@Slf4j
@Controller
public abstract class TestController  {

    @Autowired
    private TestService testServiceImpl1;

//    @Lookup("testServiceImpl1")
//    protected abstract TestService getTestServiceImpl1();

    public void test() {
        testServiceImpl1.test();
//      log.info("controller hashcode：{}", this.hashCode());
//      log.info("testServiceImpl1 hashcode：{}", getTestServiceImpl1().hashCode());
    }


}
