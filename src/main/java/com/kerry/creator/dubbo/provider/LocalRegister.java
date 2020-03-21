package com.kerry.creator.dubbo.provider;

import java.util.HashMap;
import java.util.Map;

/**
 * **********书山有路勤为径**********
 * 本地注册
 * @author k1rry
 * @date 2020/3/21
 * **********学海无涯苦作舟**********
 */
public class LocalRegister {

    private static Map<String, Class> map = new HashMap<>();

    public static void register(String interfaceName, Class implClass) {
        map.put(interfaceName, implClass);
    }

    public static Class get(String interfaceName) {
        return map.get(interfaceName);
    }

}
