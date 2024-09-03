package decorator;

public abstract class ExtraAdditionDecorator extends Consumation { // Decorator

  protected Consumation consumation;

  @Override
  public abstract String getProductName();

}
