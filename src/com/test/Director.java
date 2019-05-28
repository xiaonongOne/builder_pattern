package com.test;

/**
 * @ProjectName: builder_pattern
 * @Package: com.test
 * @ClassName: Director
 * @Description: 指挥者类
 * @Author: Ni Shichao
 * @Version: 1.0
 */
public class Director {

    public void construct(Builder builder) {
        builder.buildPartA();
        builder.buildPartB();
    }
}
