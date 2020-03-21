package com.kerry.creator.dubbo_spi.impl;

import com.alibaba.dubbo.common.URL;
import com.kerry.creator.dubbo_spi.api.CarService;
import com.kerry.creator.dubbo_spi.api.Driver;
import lombok.extern.slf4j.Slf4j;

/**
 * **********书山有路勤为径**********
 *
 * @author k1rry
 * @date 2020/3/21
 * **********学海无涯苦作舟**********
 */
@Slf4j
public class Trucker implements Driver {

    private CarService carService;

    public void setCarService(CarService carService) {
        this.carService = carService;
    }

    @Override
    public void driveCar(URL url) {
        log.info("driveCar...");
        carService.getColor(url);
    }
}
