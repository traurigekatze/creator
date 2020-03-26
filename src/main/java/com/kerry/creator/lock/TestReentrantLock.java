package com.kerry.creator.lock;


import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

class TestReentrantLock {

    public static void main(String[] args) {
        TestReentrantLock testReentrantLock = new TestReentrantLock();
        testReentrantLock.test();
    }

    private void test() {
        final ReentrantLock lock = new ReentrantLock(true);
        Thread thread1 = new Thread("t1") {
            @Override
            public void run() {
                lock.lock();
                logic();
                try {
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                lock.unlock();
            }
        };
        thread1.start();

        Thread thread2 = new Thread("t2") {
            @Override
            public void run() {
                lock.lock();
                logic();
                lock.unlock();
            }
        };
        thread2.start();
    }

    private void logic() {
        String name = Thread.currentThread().getName();
        System.out.println(name + " -- try test lock");
    }

}
