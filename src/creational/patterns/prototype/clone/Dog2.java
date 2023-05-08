package creational.patterns.prototype.clone;


/**
 * @description:
 * @author: OnePotSake
 * 变种
 */
public class Dog2 implements Cloneable {
 int age; String name; int hit;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHit() {
        return hit;
    }

    public void setHit(int hit) {
        this.hit = hit;
    }


  @Override
  protected Dog2 clone() throws CloneNotSupportedException {
    return (Dog2) super.clone();
  }
}
