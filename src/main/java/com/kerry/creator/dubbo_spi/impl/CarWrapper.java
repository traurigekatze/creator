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
public class CarWrapper implements CarService {

    private CarService carService;

    public CarWrapper(CarService carService) {
        this.carService = carService;
    }

    @Override
    public void getColor() {
      log.info("before----------");
      carService.getColor();
      log.info("end----------");
    }

    @Override
    public void getColor(URL url) {
        log.info("before----------");
        carService.getColor();
        log.info("end----------");
    }
}
