package creational.patterns.prototype.clone;


/**


 *  浅克隆:
 *  浅克隆中所有变量的值与原对象完全相同(引用数据类型中存储的引用地址也完全相同)
 */
public class ShallowClone implements  Cloneable {

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

    public ShallowClone() {
        System.out.println("原型对象是否创建成功!!!");
    }


    @Override
    protected ShallowClone clone() throws CloneNotSupportedException {
        System.out.println("克隆对象复制成功1!!!");
        return (ShallowClone) super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Dog dog = new Dog();
        dog.setName("12312");
        ShallowClone shallowClone = new ShallowClone();
        shallowClone.setDog(dog);


        ShallowClone clone = shallowClone.clone();

        System.out.println("是否相同? " +  ( clone == shallowClone));
        // 复制引用,实际还为同一个地址
        System.out.println("是否相同? " +  ( clone.getDog() == shallowClone.getDog()));
        System.out.println("是否相同? " +  ( clone.getDog().getName().equals(shallowClone.getDog().getName())));




    }
}
