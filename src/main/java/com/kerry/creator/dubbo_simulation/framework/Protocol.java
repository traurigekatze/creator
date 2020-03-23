package com.kerry.creator.dubbo_simulation.framework;

/**
 * **********书山有路勤为径**********
 *
 * @author k1rry
 * @date 2020/3/21
 * **********学海无涯苦作舟**********
 */
public interface Protocol {

    void start(URL url);

    String send(URL url, Invocation invocation);

}
