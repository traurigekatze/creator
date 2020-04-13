package com.kerry.creator.singleton;

/**
 * **********书山有路勤为径**********
 * hungry singleton init
 * @author k1rry
 * @date 2020/4/13
 * **********学海无涯苦作舟**********
 */
public class SingletonHungryInit {

    private SingletonHungryInit() {}

    private static SingletonHungryInit hungry = new SingletonHungryInit();

    /**
     * get hungry singleton
     * 在classLoad的时候，就创建对象实例
     * @return
     */
    public static SingletonHungryInit getHungry() {
        return hungry;
    }

}
