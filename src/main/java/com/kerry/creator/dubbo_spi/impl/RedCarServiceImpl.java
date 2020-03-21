package com.kerry.creator.dubbo_spi.impl;

import com.alibaba.dubbo.common.URL;
import com.kerry.creator.dubbo_spi.api.CarService;
import lombok.extern.slf4j.Slf4j;

/**
 * **********书山有路勤为径**********
 *
 * @author k1rry
 * @date 2020/3/21
 * **********学海无涯苦作舟**********
 */
@Slf4j
public class RedCarServiceImpl implements CarService {

    @Override
    public void getColor() {
        log.info("this is red car...");
    }

    @Override
    public void getColor(URL url) {
        log.info("this is red car...");
    }
}
