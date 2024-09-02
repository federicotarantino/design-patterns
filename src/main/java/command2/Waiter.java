package command2;

public class Waiter { // Invoker

  private Order order;

  public Waiter(Order ord) {
    this.order = ord;
  }

  public void execute() {
    this.order.execute();
  }

}
