package com.kerry.creator.springframework.service.impl;

import com.kerry.creator.springframework.dao.TestIocDao;
import com.kerry.creator.springframework.service.TestIocService;
import org.springframework.stereotype.Component;

/**
 * **********书山有路勤为径**********
 *
 * @author k1rry
 * @date 2020/3/26
 * **********学海无涯苦作舟**********
 */
@Component
public class TestIocServiceImpl implements TestIocService {

    private TestIocDao testIocDao;

    /**
     * 构造方法注入
     * @param testIocDao
     */
    public TestIocServiceImpl(TestIocDao testIocDao) {
        this.testIocDao = testIocDao;
    }

//    /**
//     * setter 注入方式
//     * @param testIocDao
//     */
//    public void setTestIocDao(TestIocDao testIocDao) {
//        this.testIocDao = testIocDao;
//    }



    @Override
    public void testIoc() {
        testIocDao.test();
    }
}
