package com.kerry.creator.dubbo.provider.impl;

import com.kerry.creator.dubbo.provider.api.HelloService;

/**
 * **********书山有路勤为径**********
 *
 * @author k1rry
 * @date 2020/3/21
 * **********学海无涯苦作舟**********
 */
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String username) {
        return "hello--" + username;
    }

}
