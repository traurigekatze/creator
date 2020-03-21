package com.kerry.creator.dubbo_spi;

import com.alibaba.dubbo.common.extension.ExtensionLoader;
import com.kerry.creator.dubbo_spi.api.CarService;

/**
 * **********书山有路勤为径**********
 *
 * @author k1rry
 * @date 2020/3/21
 * **********学海无涯苦作舟**********
 */
public class CarDemo {

    public static void main(String[] args) {
        // dubbo spi basic && aop
        ExtensionLoader<CarService> extensionLoader = ExtensionLoader.getExtensionLoader(CarService.class);
        CarService redCarService = extensionLoader.getExtension("red");
        redCarService.getColor();
    }

}
