package decorator;

public abstract class Consumation { // Component

  String productName = "";

  public String getProductName() {
    return productName;
  }

  public abstract double getPrice();

}
