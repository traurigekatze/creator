package com.kerry.creator.optional;

import com.kerry.creator.lambda.Person;

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
        return Optional.ofNullable(person).map(Person::getName).orElse("");
    }

}
