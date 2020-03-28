package com.kerry.creator.service.impl;

import com.kerry.creator.service.TestService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * **********书山有路勤为径**********
 *
 * @author k1rry
 * @date 2020/3/28
 * **********学海无涯苦作舟**********
 */
@Service
@Scope(value = "prototype")
public class TestServiceImpl1 implements TestService {

    @Override
    public void test() {
        System.out.println("test service impl 1...");
    }
}
