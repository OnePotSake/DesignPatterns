package creational.patterns.builder.simple.builder;

import creational.patterns.builder.simple.vo.Bike;

/**
 * 单车 建造者
 */
public class MobikeBuilder extends Builder {


    @Override
    public void builderFrame() {
        System.out.println("制 作膜拜 车辆");


    }

    @Override
    public void buildSeat() {
        System.out.println("制作 mobai  车座位");

    }

    @Override
    public Bike createBike() {
        System.out.println("制作 mobai  车工程");
        return null;

    }


}
