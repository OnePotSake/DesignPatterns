package creational.patterns.builder.simple.builder;

import creational.patterns.builder.simple.vo.Bike;

/**
 * 单车 建造者
 */
public class HaLuobikeBuilder extends Builder {


    @Override
    public void builderFrame() {
        System.out.println("制作 哈罗 车辆");


    }

    @Override
    public void buildSeat() {
        System.out.println("制作哈罗 车座位");

    }

    @Override
    public Bike createBike() {

        System.out.println("制作哈罗 车成功");
        return null;

    }


}
