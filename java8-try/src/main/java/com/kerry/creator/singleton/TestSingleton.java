package com.kerry.creator.singleton;

/**
 * **********书山有路勤为径**********
 *
 * @author k1rry
 * @date 2020/4/13
 * **********学海无涯苦作舟**********
 */
public class TestSingleton {

    public static void main(String[] args) {
        int cnt = 100;
        for (int i = 1; i < cnt; i++) {
            int finalI = i;
            ((Runnable) () -> System.out.println("hungry--thread" + finalI + "：" + SingletonHungryInit.getHungry().hashCode())).run();
        }
        System.out.println();
        for (int i = 1; i < cnt; i++) {
            int finalI = i;
            ((Runnable) () -> System.out.println("lazy--thread" + finalI + "：" + SingletonLazyDbc.getLazy().hashCode())).run();
        }
        System.out.println();
        for (int i = 1; i < cnt; i++) {
            int finalI = i;
            ((Runnable) () -> System.out.println("inner--thread" + finalI + "：" + SingletonLazyInnerClazz.getInnerClazz().hashCode())).run();
        }
    }

}
