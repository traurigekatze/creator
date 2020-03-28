package com.kerry.creator.dubbo_spi.api;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.Adaptive;
import com.alibaba.dubbo.common.extension.SPI;

/**
 * **********书山有路勤为径**********
 *
 * @author k1rry
 * @date 2020/3/21
 * **********学海无涯苦作舟**********
 */
@SPI
public interface CarService {

    void getColor();

    @Adaptive(value = "carType")
    void getColor(URL url);

}
