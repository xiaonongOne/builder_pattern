package com.test;

/**
 * @ProjectName: builder_pattern
 * @Package: com.test
 * @ClassName: ConcreteBuilderA
 * @Description: 具体建造者类
 * @Author: Ni Shichao
 * @Version: 1.0
 */
public class ConcreteBuilderB implements  Builder {

    private Product product = new Product();
    @Override
    public void buildPartA() {
        product.add("部件X");
    }

    @Override
    public void buildPartB() {
        product.add("部件Y");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
