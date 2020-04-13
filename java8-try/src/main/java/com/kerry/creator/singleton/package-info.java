package com.kerry.creator.singleton;

/*

singleton：

1、lazy：只有在使用的时候，才会初始化对象

    1、double check：获取对象的时候，先判断是否需要初始化对象；在初始化操作的时候会对初始化代码Sync，同时Sync代码中会再进行一次 check

    2、inner class：使用静态内部类获取对象。结合lazy 和 hungry有点。但在静态内部类初始化后，会再永久代存在一个inner class 对象。

2、hungry：在初始化的时候，就初始化对象
    1、hungry：初始化时就创建对象。类长时间不使用时，就会导致内存浪费。

 */