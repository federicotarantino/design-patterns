package decorator;

public class Hamburger extends Consumation { // ConcreteComponent

  public Hamburger() {
    productName = "Hamburger";
  }

  @Override
  public double getPrice() {
    return 2.00;
  }

}
