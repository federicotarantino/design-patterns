package decorator;

public class ExtraKetchupDecorator extends ExtraAdditionDecorator {

  public ExtraKetchupDecorator(Consumation consumation){
    this.consumation = consumation;
  }

  @Override
  public String getProductName() {
    return consumation.getProductName()+ " + ketchup";
  }

  @Override
  public double getPrice() {
    return consumation.getPrice()+0.10;
  }

}
