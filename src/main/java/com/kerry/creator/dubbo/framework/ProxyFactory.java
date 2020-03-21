package com.kerry.creator.dubbo.framework;

import com.kerry.creator.dubbo.register.RemoteMapRegister;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * **********书山有路勤为径**********
 *
 * @author k1rry
 * @date 2020/3/21
 * **********学海无涯苦作舟**********
 */
public class ProxyFactory {

    public static <T> T getProxy(Class interfaceClass) {
        return (T) Proxy.newProxyInstance(interfaceClass.getClassLoader(), new Class[]{interfaceClass}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Protocol protocol = ProtocolFactory.getProtocol();
                Invocation invocation = new Invocation(interfaceClass.getName(), method.getName(), method.getParameterTypes(), args);

                URL url = RemoteMapRegister.random(interfaceClass.getName());
                String result = protocol.send(url, invocation);
                return result;
            }
        });
    }

}
