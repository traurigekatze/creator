package com.kerry.creator;

import com.kerry.creator.config.IocConfig;
import com.kerry.creator.controller.TestController;
import com.kerry.creator.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * **********书山有路勤为径**********
 *
 * @author k1rry
 * @date 2020/3/28
 * **********学海无涯苦作舟**********
 */
@Slf4j
public class SpringIocApplication {

    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("SpringIoc.xml");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(IocConfig.class);

//        log.info("controller1 hashcode.。。。");
        TestController controller = context.getBean("testController", TestController.class);
        controller.test();
//        log.info("controller2 hashcode.。。。");
//        TestController controller2 = context.getBean("testController", TestController.class);
//        controller2.test();
//        log.info("controller3 hashcode.。。。");
//        TestController controller3 = context.getBean("testController", TestController.class);
//        controller3.test();
    }

}
