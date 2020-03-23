package com.kerry.creator.java8_feature.lambda.method_ref;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

/**
 * **********书山有路勤为径**********
 * 方法引用
 * @author k1rry
 * @date 2020/3/23
 * **********学海无涯苦作舟**********
 */
@Slf4j
public class Car_Ref {

    public static void printName(Car_Ref car_ref) {
        log.info("print car name...");
    }

    public String getName() {
        log.info("get car name...");
        return "获取car的名字";
    }

    public static String flatName(Supplier<String> supplier) {
        log.info("flat car name...");
        return "填充car的名字" + supplier.get();
    }

    public static Car_Ref flatCar(Supplier<Car_Ref> supplier) {
        Car_Ref car_ref = supplier.get();
        log.info("flat car...");
        return car_ref;
    }

    public static void main(String[] args) {
        List<Car_Ref> list = Arrays.asList(new Car_Ref(), new Car_Ref());
        list.forEach(Car_Ref::printName);

        Car_Ref car_ref = new Car_Ref();
        Car_Ref.flatName(car_ref::getName);

        Car_Ref.flatName(()-> "bmw");

        Car_Ref.flatCar(Car_Ref::new);
    }

}
