package creational.patterns.prototype.clone;

/**
 *  深克隆:
 *  克隆对象所有基本书类型包含值与原型值一致(不包含引用数据类型)
 */
public class DeepClone implements  Cloneable {

    private String name;

    private Dog dog;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public DeepClone() {
        System.out.println("原型对象是否创建成功!!!");
    }


    @Override
    protected DeepClone clone() throws CloneNotSupportedException {
        System.out.println("克隆对象复制成功1!!!");
        DeepClone clone = (DeepClone) super.clone();

        String name = clone.dog.getName();
        // .... 赋值
        clone.dog = new Dog();
        clone.dog.setName(name);
        return clone;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Dog dog = new Dog();
        dog.setName("12312");
        DeepClone deepClone = new DeepClone();
        deepClone.setDog(dog);


        DeepClone clone = deepClone.clone();
        System.out.println("是否相同? " +  ( clone == deepClone));
        // 完全创建一个新的对象,故没有复制原有对象 他们地址不同
        System.out.println("是否相同? " +  ( clone.getDog() == deepClone.getDog()));
        System.out.println("是否相同? " +  ( clone.getDog().getName().equals(deepClone.getDog().getName())));
    }
}
