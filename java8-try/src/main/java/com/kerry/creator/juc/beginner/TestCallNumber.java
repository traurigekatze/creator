package com.kerry.creator.juc.beginner;

import java.util.concurrent.*;

/**
 * **********书山有路勤为径**********
 *
 * @author k1rry
 * @date 2020/4/6
 * **********学海无涯苦作舟**********
 */
public class TestCallNumber {

    public static void main(String[] args) {
        MockCallNumber callNumber = new MockCallNumber();

        ExecutorService executor = Executors.newFixedThreadPool(3);
        executor.execute(callNumber);
        executor.execute(callNumber);
        executor.execute(callNumber);
    }

}
