package creational.patterns.factorypattern.simplefactory.vo;

import java.util.Random;

public class Bag {
    private String name;

    // 面值
    private String size;


    public Bag(String name) {
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
        return "Bag{" +
                "name='" + name + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
