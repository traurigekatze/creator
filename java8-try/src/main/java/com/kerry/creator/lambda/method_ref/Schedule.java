package com.kerry.creator.lambda.method_ref;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * **********书山有路勤为径**********
 * 重复注解
 * @author k1rry
 * @date 2020/3/23
 * **********学海无涯苦作舟**********
 */
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(value = Schedule.Schedules.class)
public @interface Schedule {

    int dayOfWeek() default 1;

    int hour() default 0;

    @Retention(RetentionPolicy.RUNTIME)
    @interface Schedules {
        Schedule[] value();
    }

}
