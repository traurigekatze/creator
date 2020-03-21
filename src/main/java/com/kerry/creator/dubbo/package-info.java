package com.kerry.creator.dubbo;

/*

手写模拟 dubbo
1、provider：提供api、实现api、暴露（启动tomcat,nettyServer）、服务本地注册、服务注册中心注册

2、consumer：根据接口名从注册中心获取服务地址、调用服务

3、registry：保存服务配置信息（服务名：list<url>）

4、rpcProtocol：基于tomcat的httpProtocol、基于netty的dubboProtocol

5、framework：框架实现

 */