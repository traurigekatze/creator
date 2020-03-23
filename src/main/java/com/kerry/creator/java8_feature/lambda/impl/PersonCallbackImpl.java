package com.kerry.creator.java8_feature.lambda.impl;

import com.kerry.creator.java8_feature.lambda.Person;
import com.kerry.creator.java8_feature.lambda.api.PersonCallback;

/**
 * **********书山有路勤为径**********
 *
 * @author k1rry
 * @date 2020/3/23
 * **********学海无涯苦作舟**********
 */
public class PersonCallbackImpl implements PersonCallback {

    @Override
    public void callback(Person person) {
        System.out.println("test callback");
    }

    public static void main(String[] args) {
        PersonCallbackImpl personCallback = new PersonCallbackImpl();
        personCallback.testDefault();
    }

}
