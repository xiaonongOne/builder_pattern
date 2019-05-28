package com.test.bicycle;

/**
 * @ProjectName: builder_pattern
 * @Package: com.test.bicycle
 * @ClassName: EngineeringDepartment
 * @Description: 指挥者 工程部
 * @Author: Ni Shichao
 * @Version: 1.0
 */
public class EngineeringDepartment {

    // 用户告知指挥者想要什么样的单车
    BikeBuilder bikeBuilder;

    public EngineeringDepartment(BikeBuilder bikeBuilder){
        this.bikeBuilder = bikeBuilder;
    }

    // 指导组装单车
    public void Construct(){
        bikeBuilder.buildTyres();
        bikeBuilder.buildFrame();
        bikeBuilder.buildGPS();
    }
}
