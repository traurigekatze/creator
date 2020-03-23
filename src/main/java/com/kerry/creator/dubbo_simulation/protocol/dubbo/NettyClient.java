package com.kerry.creator.dubbo_simulation.protocol.dubbo;

import com.kerry.creator.dubbo_simulation.framework.Invocation;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.serialization.ClassResolvers;
import io.netty.handler.codec.serialization.ObjectDecoder;
import io.netty.handler.codec.serialization.ObjectEncoder;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * **********书山有路勤为径**********
 *
 * @author k1rry
 * @date 2020/3/21
 * **********学海无涯苦作舟**********
 */
public class NettyClient {

    public NettyClientHandler client = null;

    private static ExecutorService executorService = Executors.newCachedThreadPool();

    public void start(String hostname, Integer port) {
        client = new NettyClientHandler();

        Bootstrap b = new Bootstrap();
        EventLoopGroup group = new NioEventLoopGroup();

        b.group(group).channel(NioSocketChannel.class).option(ChannelOption.TCP_NODELAY, true)
                .handler(new ChannelInitializer<SocketChannel>() {
                    @Override
                    protected void initChannel(SocketChannel ch) throws Exception {
                        ChannelPipeline pipeline = ch.pipeline();
                        pipeline.addLast("decoder", new ObjectDecoder(ClassResolvers.weakCachingResolver(this.getClass().getClassLoader())));
                        pipeline.addLast("encoder", new ObjectEncoder());
                        pipeline.addLast("handler", client);
                    }
                });
        try {
            b.connect(hostname, port).sync();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String send(String hostname, Integer port, Invocation invocation) {
        if (client == null) {
            start(hostname, port);
        }
        client.setInvocation(invocation);
        try {
            return (String) executorService.submit(client).get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        return null;
    }

}
