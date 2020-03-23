package com.kerry.creator.java8_feature.lambda.api;

import com.kerry.creator.java8_feature.lambda.Person;

/**
 * **********书山有路勤为径**********
 *
 * @author k1rry
 * @date 2020/3/23
 * **********学海无涯苦作舟**********
 */
@FunctionalInterface // 函数式接口：只能有一个抽象方法：
public interface PersonCallback {

    void callback(Person person);

    /**
     * 默认方法：接口呢就需要实现的。实现接口后，可重写可不重写
     */
    default void testDefault() {
        System.out.println("test default...");
    }

    /**
     * 静态方法：可直接接口调用
     */
    static void testStatic() {
        System.out.println("test static...");
    }

    static void main(String[] args) {
        PersonCallback.testStatic();
    }

}
