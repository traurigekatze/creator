package com.kerry.creator.clazz;

import lombok.Data;

/**
 * @author youxia
 * @date 2020/4/12
 **/
@Data
public class TestClazz {

    private String name;

    private Integer age;

    private void info() {
        String info = name + "：" + age;
        System.out.println(info);
    }

    public TestClazz(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        TestClazz clazz = new TestClazz("瓜皮", 24);
        clazz.info();
    }
}
