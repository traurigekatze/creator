package com.kerry.creator.java8_feature.lambda;

import com.kerry.creator.java8_feature.lambda.api.PersonCallback;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.function.IntFunction;

/**
 * **********书山有路勤为径**********
 *
 * @author k1rry
 * @date 2020/3/23
 * **********学海无涯苦作舟**********
 */
@Data
@Slf4j
public class Person {

    private int id;

    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * 匿名类不类方法
     * @param id
     * @param name
     * @param personCallback
     */
    public static void create(Integer id, String name, PersonCallback personCallback) {
        personCallback.callback(new Person(id, name));
    }

    /**
     * 测试java提供的function
     * @param i
     * @param function
     * @return
     */
    public static Object testFunction(int i, IntFunction function) {
        return function.apply(i);
    }

    public static void main(String[] args) {
        // old
//        Person.create(1, "kerry", new PersonCallback() {
//            @Override
//            public void callback(Person person) {
//                log.info("to login...");
//            }
//        });

        // new
        /**
         * lambda表达式：完成了 实现接口并且实现接口里的方法 的功能。【动作传递】
         */
        Person.create(1, "kerry", person -> log.info("to login..."));

        Person.testFunction(1, (int i) -> {return 1;});

    }

}
