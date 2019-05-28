package com.test;

/**
 * @ProjectName: builder_pattern
 * @Package: com.test
 * @ClassName: Builder
 * @Description: 抽象建造者类，确定产品由2个部件PartA 和PartB组成，并声明一个得到产品建造
 *               后结果的方法 GetResult
 * @Author: Ni Shichao
 * @Version: 1.0
 */
public interface Builder {

    void buildPartA();

    void buildPartB();

    Product getResult();

}
