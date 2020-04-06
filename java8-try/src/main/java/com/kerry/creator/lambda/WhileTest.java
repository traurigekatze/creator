package com.kerry.creator.lambda;

import java.util.Arrays;
import java.util.List;

/**
 * **********书山有路勤为径**********
 *
 * @author k1rry
 * @date 2020/3/31
 * **********学海无涯苦作舟**********
 */
public class WhileTest {

    public static void main(String[] args) {
        int i = 10;
        do {
            i = i / 2;
            System.out.println("i===" + i);
        } while (i-->1);
        System.out.println(i);
        List<String> list = Arrays.asList("123", "456", "789");
        list.forEach(s -> {
            System.out.println(s);
        });
    }

}
