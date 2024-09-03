package decorator;

public class CheeseBurger extends Consumation { // ConcreteComponent

  public CheeseBurger() {
    productName = "CheeseBurger";
  }

  @Override
  public double getPrice() {
    return 2.50;
  }

}
