package com.kerry.creator.dubbo.framework;

import lombok.Data;

import java.io.Serializable;

/**
 * **********书山有路勤为径**********
 *
 * @author k1rry
 * @date 2020/3/21
 * **********学海无涯苦作舟**********
 */
@Data
public class Invocation implements Serializable {

    private String interfaceName;

    private String methodName;

    private Class[] paramTypes;

    private Object[] params;

    public Invocation(String interfaceName, String methodName, Class[] paramTypes, Object[] params) {
        this.interfaceName = interfaceName;
        this.methodName = methodName;
        this.paramTypes = paramTypes;
        this.params = params;
    }
}
