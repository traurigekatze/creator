package com.kerry.creator.dubbo_spi;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.ExtensionLoader;
import com.kerry.creator.dubbo_spi.api.Driver;

import java.util.HashMap;
import java.util.Map;

/**
 * **********书山有路勤为径**********
 *
 * @author k1rry
 * @date 2020/3/21
 * **********学海无涯苦作舟**********
 */
public class DriveDemo {

    public static void main(String[] args) {
        // dubbo_simulation spi ioc
        ExtensionLoader<Driver> extensionLoader = ExtensionLoader.getExtensionLoader(Driver.class);
        Driver driver = extensionLoader.getExtension("trucker");

        Map<String, String> map = new HashMap<>();
        map.put("carType", "black");
        URL url = new URL("", "", 0, map);
        driver.driveCar(url);
    }

}
