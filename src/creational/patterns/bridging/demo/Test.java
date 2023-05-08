package creational.patterns.bridging.demo;

/**
 * @author OnePotSake
 * @version 1.0
 * @project spring-demo
 * @description test
 * @date 5/1/23 19:24:28
 */
public class Test {
  public static void main(String[] args) {
    Bank bank = new ZhengZhouBank(new TraditionBank());
    bank.pay();
  }
}
