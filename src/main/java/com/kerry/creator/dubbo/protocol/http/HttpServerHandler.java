package com.kerry.creator.dubbo.protocol.http;

import com.kerry.creator.dubbo.framework.Invocation;
import com.kerry.creator.dubbo.provider.LocalRegister;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * **********书山有路勤为径**********
 *
 * @author k1rry
 * @date 2020/3/21
 * **********学海无涯苦作舟**********
 */
@Slf4j
public class HttpServerHandler {

    public void handler(HttpServletRequest req, HttpServletResponse resp) {
        // 处理请求，返回结果
        try {
            InputStream inputStream = req.getInputStream();
            ObjectInputStream ois = new ObjectInputStream(inputStream);

            Invocation invocation = (Invocation) ois.readObject();

            Class implClass = LocalRegister.get(invocation.getInterfaceName());

            Method method = implClass.getMethod(invocation.getMethodName(), invocation.getParamTypes());

            String result = (String) method.invoke(implClass.newInstance(), invocation.getParams());
            log.info("use http");
            IOUtils.write(result, resp.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }

}
