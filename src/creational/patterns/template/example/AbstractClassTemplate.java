package creational.patterns.template.example;

/**
 * @author OnePotSake
 * @version 1.0
 * @project spring-demo
 * @description
 * @date 5/3/23 19:09:17
 */
public abstract class AbstractClassTemplate {
  void step1(String key){
    System.out.println("在模板类中 -> 执行步骤1");
    if(step2(key)){
      step3();
    }else{
      step4();
    }

    step5();
  }

  boolean step2(String key){
    System.out.println("在模板类中 -> 执行步骤2");
    if("x".equals(key)){
      return true;
    }
    return false;
  }

  abstract void step3();

  abstract void step4();

  void step5(){
    System.out.println("在模板类中 -> 执行步骤5");
  }

  void run(String key){
    step1(key);
  }
}