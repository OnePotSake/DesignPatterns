package creational.patterns.decorators.explatem;

/**
 * @author OnePotSake
 * @version 1.0
 * @project spring-demo
 * @description
 * @date 5/1/23 21:43:17
 */
public class Test {
  public static void main(String[] args) {

    Drink drink = new Sugar(new Coffee());
    System.out.println("所点产品为: " + drink.getName());
    System.out.println("所点产品费用为: " + drink.cost());

    drink = new Miki(drink);
    System.out.println("所点产品为: " + drink.getName());
    System.out.println("所点产品费用为: " + drink.cost());

  }

}
