package com.kerry.creator.singleton;

import org.springframework.context.annotation.Lazy;

/**
 * **********书山有路勤为径**********
 * lazy singleton inner class（Holder模式）
 * @author k1rry
 * @date 2020/4/13
 * **********学海无涯苦作舟**********
 */
public class SingletonLazyInnerClazz {

    private SingletonLazyInnerClazz() {}

    /**
     * 静态内部类，只有在第一次使用的时候，才会初始化
     */
    private static class LazyInnerClazz {
        private static final SingletonLazyInnerClazz innerClazz = new SingletonLazyInnerClazz();
    }

    /**
     * get inner class
     * 结合hungry && lazy 优点，内部类只有在使用的时候才会被初始化。但永久代中会一直存在 LazyInnerClazz 对象实例
     * @return
     */
    public static SingletonLazyInnerClazz getInnerClazz() {
        return LazyInnerClazz.innerClazz;
    }

}
