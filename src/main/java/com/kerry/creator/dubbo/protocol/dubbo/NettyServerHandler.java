package com.kerry.creator.dubbo.protocol.dubbo;

import com.kerry.creator.dubbo.framework.Invocation;
import com.kerry.creator.dubbo.provider.LocalRegister;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Method;

/**
 * **********书山有路勤为径**********
 *
 * @author k1rry
 * @date 2020/3/21
 * **********学海无涯苦作舟**********
 */
@Slf4j
public class NettyServerHandler extends ChannelInboundHandlerAdapter {

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        Invocation invocation = (Invocation) msg;

        Class serviceImpl = LocalRegister.get(invocation.getInterfaceName());

        Method method = serviceImpl.getMethod(invocation.getMethodName(), invocation.getParamTypes());
        Object result = method.invoke(serviceImpl.newInstance(), invocation.getParams());

        log.info("Netty----------{}", result.toString());
        ctx.writeAndFlush("Netty：" + result);
    }
}
