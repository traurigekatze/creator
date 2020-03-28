package com.kerry.creator.service.impl;

import com.kerry.creator.service.TestService;
import org.springframework.stereotype.Service;

/**
 * **********书山有路勤为径**********
 *
 * @author k1rry
 * @date 2020/3/28
 * **********学海无涯苦作舟**********
 */
@Service
public class TestServiceImpl2 implements TestService {

    @Override
    public void test() {
        System.out.println("test service impl 2...");
    }
}
