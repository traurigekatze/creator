package com.kerry.creator.java8_feature.lambda.method_ref;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/**
 * **********书山有路勤为径**********
 * 重复注解
 * @author k1rry
 * @date 2020/3/23
 * **********学海无涯苦作舟**********
 */
public class Repeat_Annotation {

    @Schedule(dayOfWeek = 3, hour = 20)
    @Schedule(dayOfWeek = 4, hour = 21)
    public void run() {
        System.out.println("do task...");
    }

    public void runName(String name) {
        System.out.println("do run get parameter name...");
    }

    public static void main(String[] args) {
        try {
            Method method = Repeat_Annotation.class.getMethod("run");
            for (Annotation annotation : method.getAnnotations()) {
                System.out.println(annotation);
            }
            for (Schedule schedule : method.getAnnotationsByType(Schedule.class)) {
                System.out.println(schedule.dayOfWeek() + "|" + schedule.hour());
            }

            // 获取参数名
            Method runName = Repeat_Annotation.class.getMethod("runName", String.class);
            for (Parameter parameter : runName.getParameters()) {
                System.out.println(parameter);
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

}
