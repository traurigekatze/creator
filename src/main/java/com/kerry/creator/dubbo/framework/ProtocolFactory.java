package com.kerry.creator.dubbo.framework;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * **********书山有路勤为径**********
 *
 * @author k1rry
 * @date 2020/3/21
 * **********学海无涯苦作舟**********
 */
public class ProtocolFactory {

    public static Protocol getProtocol() {
        // java spi
        ServiceLoader<Protocol> serviceLoader = ServiceLoader.load(Protocol.class);
        Iterator<Protocol> iterator = serviceLoader.iterator();
        return iterator.next();

//        String name = StringUtils.isNotBlank(System.getProperty("protocolName")) ? System.getProperty("protocolName") : "http";
//        switch (name) {
//            case "http":
//                return new HttpProtocol();
//            case "netty":
//                return new DubboProtocol();
//        }
//        return new HttpProtocol();
    }

}
