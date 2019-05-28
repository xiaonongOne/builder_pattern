package com.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: builder_pattern
 * @Package: com.test
 * @ClassName: Product
 * @Description: 产品类由多个部件组成
 * @Author: Ni Shichao
 * @Version: 1.0
 */
public class Product {

    List<String> parts = new ArrayList<String>();
    // 添加产品部件
    public void add(String part) {
        parts.add(part);
    }
    // 查询产品部件
    public void show() {
        for (String part: parts) {
            System.out.println(part);
        }
    }

}
