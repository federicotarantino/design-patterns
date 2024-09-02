package command2;

public class Command2Driver {

  public static void main(String[] args) {
    Chef chef = new Chef();

    Order order = new Order(chef, "Pasta");
    Waiter waiter = new Waiter(order);
    waiter.execute();

    order = new Order(chef, "Torta");
    waiter = new Waiter(order);
    waiter.execute();
  }
}
