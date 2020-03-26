package com.kerry.creator.springframework;

import com.kerry.creator.springframework.service.TestIocService;
import com.kerry.creator.springframework.service.impl.TestIocServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * **********书山有路勤为径**********
 *
 * @author k1rry
 * @date 2020/3/26
 * **********学海无涯苦作舟**********
 */
public class IocTestApplication {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext xmlApplicationContext = new ClassPathXmlApplicationContext("springTestIoc.xml");
        TestIocServiceImpl iocService = xmlApplicationContext.getBean("testIocService", TestIocServiceImpl.class);
        iocService.testIoc();
    }

}
