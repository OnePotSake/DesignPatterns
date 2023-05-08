package creational.patterns.prototype.clone;

/**
 *  深克隆:
 *  克隆对象所有基本书类型包含值与原型值一致(不包含引用数据类型)
 *
 *  变种
 */
public class DeepClone2 implements  Cloneable {

    private String name;

    private Dog2 dog;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog2 getDog() {
        return dog;
    }

    public void setDog(Dog2 dog) {
        this.dog = dog;
    }

    public DeepClone2() {
        System.out.println("原型对象是否创建成功!!!");
    }


    @Override
    protected DeepClone2 clone() throws CloneNotSupportedException {
        System.out.println("克隆对象复制成功1!!!");
        DeepClone2 clone = (DeepClone2) super.clone();
        clone.dog = (Dog2) dog.clone();
        return clone;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Dog2 dog = new Dog2();
        dog.setName("张三");
        DeepClone2 deepClone = new DeepClone2();
        deepClone.setDog(dog);


        DeepClone2 clone = deepClone.clone();
        System.out.println("是否相同? " +  ( clone == deepClone));
        // 完全创建一个新的对象,故没有复制原有对象 他们地址不同
        System.out.println("是否相同? " +  ( clone.getDog() == deepClone.getDog()));
        System.out.println("是否相同? " +  ( clone.getDog().getName().equals(deepClone.getDog().getName())));
    }
}
