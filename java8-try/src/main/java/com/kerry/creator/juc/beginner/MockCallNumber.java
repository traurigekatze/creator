package com.kerry.creator.juc.beginner;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * **********书山有路勤为径**********
 *
 * @author k1rry
 * @date 2020/4/6
 * **********学海无涯苦作舟**********
 */
@Slf4j
public class MockCallNumber implements Runnable {

    /**
     * 最大执行次数
     */
    private static final Integer MAX_NUMBER = 3000;

    private Integer nextNumber = 1;

//    private ReentrantLock lock = new ReentrantLock();

    /**
     * 叫号
     */
    private void callNumber(int number) {
        log.info("{}：call number：{}", Thread.currentThread().getName(), number);
    }


    @Override
    public void run() {
        while (nextNumber <= MAX_NUMBER) {
            synchronized (nextNumber) {
                callNumber(nextNumber);
                nextNumber++;
            }
            try {
                TimeUnit.MILLISECONDS.sleep(100L);
            } catch (InterruptedException e) {
                log.error("time unit sleep error：{}", e.getMessage(), e);
            }
            if (nextNumber > MAX_NUMBER) {
                log.info("call number over! system exit!");
                System.exit(1);
            }
        }
    }
}
