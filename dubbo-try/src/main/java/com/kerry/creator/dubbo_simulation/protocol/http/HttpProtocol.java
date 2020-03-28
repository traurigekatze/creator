package com.kerry.creator.dubbo_simulation.protocol.http;

import com.kerry.creator.dubbo_simulation.framework.Invocation;
import com.kerry.creator.dubbo_simulation.framework.Protocol;
import com.kerry.creator.dubbo_simulation.framework.URL;

/**
 * **********书山有路勤为径**********
 *
 * @author k1rry
 * @date 2020/3/21
 * **********学海无涯苦作舟**********
 */
public class HttpProtocol implements Protocol {

    @Override
    public void start(URL url) {
        new HttpServer().start(url.getHostname(), url.getPort());
    }

    @Override
    public String send(URL url, Invocation invocation) {
        return new HttpClient().send(url.getHostname(), url.getPort(), invocation);
    }
}
