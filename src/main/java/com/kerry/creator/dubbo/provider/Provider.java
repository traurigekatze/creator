package com.kerry.creator.dubbo.provider;

import com.kerry.creator.dubbo.framework.Protocol;
import com.kerry.creator.dubbo.framework.ProtocolFactory;
import com.kerry.creator.dubbo.framework.URL;
import com.kerry.creator.dubbo.provider.api.HelloService;
import com.kerry.creator.dubbo.provider.impl.HelloServiceImpl;
import com.kerry.creator.dubbo.register.RemoteMapRegister;

/**
 * **********书山有路勤为径**********
 *
 * @author k1rry
 * @date 2020/3/21
 * **********学海无涯苦作舟**********
 */
public class Provider {

    public static void main(String[] args) {
        // 1、本地注册
        // {服务名：实现类}
        LocalRegister.register(HelloService.class.getName(), HelloServiceImpl.class);

        // 2、远程注册
        // {服务名：list<url>}
        URL url = new URL("localhost", 8080);
        RemoteMapRegister.register(HelloService.class.getName(), url);

        // 3、启动tomcat
        Protocol protocol = ProtocolFactory.getProtocol();
        protocol.start(url);
    }

}
