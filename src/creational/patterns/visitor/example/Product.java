package creational.patterns.visitor.example;

import lombok.Data;

import java.time.LocalDate;

/**
 * @author OnePotSake
 * @version 1.0
 * @project spring-demo
 * @description 抽象商品类
 * @date 5/5/23 03:40:21
 */
@Data
public abstract class Product {
  private String name; // 商品名

  // 生产日期
  private LocalDate productDate;

  private double price; // 商品价格

  public Product(String name, LocalDate productDate, double price) {
    this.name = name;
    this.productDate = productDate;
    this.price = price;
  }

}
