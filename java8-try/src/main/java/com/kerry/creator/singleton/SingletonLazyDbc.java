package com.kerry.creator.singleton;

/**
 * **********书山有路勤为径**********
 * lazy singleton double check
 * @author k1rry
 * @date 2020/4/13
 * **********学海无涯苦作舟**********
 */
public class SingletonLazyDbc {

    /**
     * 当类中有多个Class 属性，在constructor方法中初始化时，可能出现指令重排
     */
    private SingletonLazyDbc() {}

    /**
     * volatile 防止指令重排。
     */
    private volatile static SingletonLazyDbc lazy = null;

    /**
     * get lazy singleton
     * 在未创建对象时创建对象，创建过程中加锁且在加锁代码内再进行非空check
     * @return
     */
    public static SingletonLazyDbc getLazy() {
        if (lazy == null) {
            synchronized (SingletonLazyDbc.class) {
                if (lazy == null) {
                    lazy = new SingletonLazyDbc();
                }
            }
        }
        return lazy;
    }

}
