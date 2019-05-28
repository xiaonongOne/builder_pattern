package com.test.bicycle;

/**
 * @ProjectName: builder_pattern
 * @Package: com.test.bicycle
 * @ClassName: BikeBuilder
 * @Description: 自行车制造商
 * @Author: Ni Shichao
 * @Version: 1.0
 */
public interface BikeBuilder {
    // 组装轮胎
    public void buildTyres();
    // 组装车架
    public void buildFrame();
    // 组装GPS定位装置
    public void buildGPS();
    // 获取自行车
    public Bike getBike();
}
