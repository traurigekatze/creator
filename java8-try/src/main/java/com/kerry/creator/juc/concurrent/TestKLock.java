package com.kerry.creator.juc.concurrent;

public class TestKLock {

    public static void main(String[] args) {
        Thread thread1 = new Thread("thread1") {
            @Override
            public void run() {
                System.out.println("thread1----begin");
                if (KLock.lock("thread")) {
                    System.out.println("thread1----use");
                }
                System.out.println("thread1----end");
            }
        };
        thread1.start();
        Thread thread2 = new Thread("thread2") {
            @Override
            public void run() {
                System.out.println("thread2----begin");
                if (KLock.lock("thread")) {
                    System.out.println("thread2----use");
                }
                System.out.println("thread2----end");
            }
        };
        thread2.start();
    }

}
