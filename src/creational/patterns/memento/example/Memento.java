package creational.patterns.memento.example;

/**
 * @author OnePotSake
 * @version 1.0
 * @project spring-demo
 * @description 备忘录角色 访问权限
 *  默认权限 (同目录下可见)
 *  保证只有发起者类可以访问备忘录
 * @date 5/8/23 13:33:22
 */
class Memento {
  private String state = "从备份对象恢复原始对象";

  private String id;

  private String name;

  private String phone;

  public Memento() {
  }

  public Memento(String id, String name, String phone) {
    this.id = id;
    this.name = name;
    this.phone = phone;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  @Override
  public String toString() {
    return "Memento{" +
        "state='" + state + '\'' +
        ", id='" + id + '\'' +
        ", name='" + name + '\'' +
        ", phone='" + phone + '\'' +
        '}';
  }


}
