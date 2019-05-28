package com.test.bicycle;

/**
 * @ProjectName: builder_pattern
 * @Package: com.test.bicycle
 * @ClassName: OfoBikeBuilder
 * @Description:
 * @Author: Ni Shichao
 * @Version: 1.0
 */
public class OfoBikeBuilder implements  BikeBuilder  {
    // 单车对象
    Bike bike = new Bike();

    @Override
    public void buildTyres() {
        bike.setTyre("黑色轮胎");
    }

    @Override
    public void buildFrame() {
        bike.setFrame("黄色车架");
    }

    @Override
    public void buildGPS() {
        bike.setGps("ofo定制版GPS定位装置");
    }

    @Override
    public Bike getBike() {
        return bike;
    }
}
