package com.test.bicycle;

/**
 * @ProjectName: builder_pattern
 * @Package: com.test.bicycle
 * @ClassName: Test
 * @Description:
 * @Author: Ni Shichao
 * @Version: 1.0
 */
public class Test {


    public static void main(String[] args) {
        // 建造摩拜单车
        BikeBuilder moBikeBuilder = new MoBikeBuilder();
        EngineeringDepartment ed1 = new EngineeringDepartment(moBikeBuilder);
        ed1.Construct();// 指导组装
        // 产出单车，体现建造和显示分离
        Bike moBike = moBikeBuilder.getBike();
        System.out.println(moBike.getFrame()+"   "+moBike.getTyre()+"   "+moBike.getGps());

        // 建造ofo单车
        BikeBuilder ofoBikeBuilder = new OfoBikeBuilder();
        EngineeringDepartment ed2 = new EngineeringDepartment(ofoBikeBuilder);
        ed2.Construct();// 指导组装
        Bike ofoBike = ofoBikeBuilder.getBike();
        System.out.println(ofoBike.getFrame()+"   "+ofoBike.getTyre()+"   "+ofoBike.getGps());

    }
}
