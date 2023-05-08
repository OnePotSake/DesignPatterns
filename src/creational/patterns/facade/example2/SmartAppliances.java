package creational.patterns.facade.example2;

/**
 * @author OnePotSake
 * @version 1.0
 * @project spring-demo
 * @description 外观模式 , 为系统提供一个统一的对外一体化接口  智能家电
 * @date 5/3/23 00:03:35
 */
public class SmartAppliances {


  // 电视
  private Tv tv;

  // 水壶
  private Kettle ke;

  // 空调
  private  AirConditioning al;


  public void open() {

    tv.open();
    ke.open();
    al.open();

  }


  public void close() {

    tv.close();
    ke.close();
    al.close();

  }

  public SmartAppliances() {
    this.tv = new Tv();
    this.ke =new Kettle();;
    this.al = new AirConditioning();
  }

  public void say(String message){
    if(message.contains("打开")){
      open();
    }else if(message.contains("关闭")){
      close();
    }else{
      System.out.println("对不起没有听清楚您说什么! 请重新再说一遍");
    }

  }





}
