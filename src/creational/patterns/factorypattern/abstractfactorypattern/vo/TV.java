package creational.patterns.factorypattern.abstractfactorypattern.vo;

import java.util.Random;

public class TV {

    private String name;

    private String size;

    public TV(String name) {
        setSize();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    private void setSize() {
        String[] sizex = {"X", "M", "L"};
        this.size = sizex[(new Random().nextInt(3))];
    }

    @Override
    public String toString() {
        return "TV{" +
                "name='" + name + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
