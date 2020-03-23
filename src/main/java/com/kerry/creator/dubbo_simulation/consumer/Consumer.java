package com.kerry.creator.dubbo_simulation.consumer;

import com.kerry.creator.dubbo_simulation.framework.ProxyFactory;
import com.kerry.creator.dubbo_simulation.provider.api.HelloService;
import lombok.extern.slf4j.Slf4j;

/**
 * **********书山有路勤为径**********
 *
 * @author k1rry
 * @date 2020/3/21
 * **********学海无涯苦作舟**********
 */
@Slf4j
public class Consumer {

    public static void main(String[] args) {

        HelloService helloService = ProxyFactory.getProxy(HelloService.class);

        log.info("consumer：result：{}", helloService.sayHello("kerry"));
    }

}
