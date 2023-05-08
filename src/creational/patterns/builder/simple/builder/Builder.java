package creational.patterns.builder.simple.builder;

import creational.patterns.builder.simple.vo.Bike;

public abstract class Builder {

    public abstract void builderFrame();
    public abstract void buildSeat();
    public abstract Bike createBike();


}
