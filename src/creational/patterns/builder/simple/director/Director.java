package creational.patterns.builder.simple.director;

import creational.patterns.builder.simple.builder.Builder;
import creational.patterns.builder.simple.vo.Bike;

/**
 * 指挥者类
 * 指挥构建汽车
 */
public class Director {

    private Builder builder;


    public Director(Builder builder) {
        this.builder = builder;
    }

    // 自行车制作方法
    public Bike construct() {
        builder.builderFrame();
        builder.buildSeat();
        return builder.createBike();
    }

}
