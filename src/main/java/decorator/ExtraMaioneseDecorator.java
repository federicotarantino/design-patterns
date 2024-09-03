package decorator;

public class ExtraMaioneseDecorator extends ExtraAdditionDecorator {

  public ExtraMaioneseDecorator(Consumation consumation){
    this.consumation = consumation;
  }
  @Override
  public String getProductName() {
    return consumation.getProductName()+ " + maionese";
  }
  @Override
  public double getPrice() {
    return consumation.getPrice()+0.20;
  }

}
