package com.kerry.creator.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * **********书山有路勤为径**********
 *
 * @author k1rry
 * @date 2020/3/28
 * **********学海无涯苦作舟**********
 */
@Configuration
//@ComponentScan(basePackages = "com.kerry.creator", nameGenerator = MyNameGenerator.class)
@ComponentScan(basePackages = "com.kerry.creator")
public class IocConfig {
}
