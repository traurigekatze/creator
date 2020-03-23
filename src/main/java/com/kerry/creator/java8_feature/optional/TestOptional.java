package com.kerry.creator.java8_feature.optional;

import com.kerry.creator.java8_feature.lambda.Person;

import java.util.Optional;

/**
 * **********书山有路勤为径**********
 *
 * @author k1rry
 * @date 2020/3/23
 * **********学海无涯苦作舟**********
 */
public class TestOptional {

    public String test(Person person) {
//        if (person != null) {
//            return person.getName();
//        }
//        return null;

        /**
         * get：获取填充的value
         * orElse(T other)：如果没值则返回other
         * orElseGet(Supplier<? extends T> other)：如果没值则执行other并返回
         *
         */
        return Optional.ofNullable(person).map(Person::getName).orElse(new Person().getName());
    }

}
