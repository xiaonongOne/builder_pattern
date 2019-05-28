package com.test;

/**
 * @ProjectName: builder_pattern
 * @Package: com.test
 * @ClassName: Test
 * @Description:
 * @Author: Ni Shichao
 * @Version: 1.0
 */
public class Test {


    public static void main(String[] args) {
        Director director = new Director();
        Builder builderA = new ConcreteBuilderA();
        Builder builderB = new ConcreteBuilderB();

        director.construct(builderA);

        Product p1 = builderA.getResult();
        p1.show();


        director.construct(builderB);

        Product p2 = builderB.getResult();
        p2.show();
    }
}
