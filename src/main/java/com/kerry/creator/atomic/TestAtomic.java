package com.kerry.creator.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class TestAtomic {
    AtomicInteger cnt = new AtomicInteger(0);

    private void test() {
        for (int i = 0; i < 10; i++) {
            cnt.incrementAndGet();
        }
    }

    public static void main(String[] args) {
        TestAtomic atomic = new TestAtomic();
        atomic.test();
        System.out.println(atomic.cnt);
    }

}
