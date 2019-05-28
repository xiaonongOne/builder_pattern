package com.test.bicycle;

/**
 * @ProjectName: builder_pattern
 * @Package: com.test.bicycle
 * @ClassName: Bike
 * @Description:
 * @Author: Ni Shichao
 * @Version: 1.0
 */
public class Bike {

    // 轮胎
    private String tyre;
    // 车架
    private String frame;
    // GPS定位装置
    private String gps;

    public String getTyre() {
        return tyre;
    }

    public void setTyre(String tyre) {
        this.tyre = tyre;
    }

    public String getFrame() {
        return frame;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }

    public String getGps() {
        return gps;
    }

    public void setGps(String gps) {
        this.gps = gps;
    }
}
