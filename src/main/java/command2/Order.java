package command2;

import command.Command;

public class Order implements Command {

  private Chef chef;
  private String food;

  public Order(Chef chef, String food) {
    this.chef = chef;
    this.food = food;
  }

  @Override
  public void execute() {
    if (this.food.equalsIgnoreCase("pasta")) {
      this.chef.cookPasta();
    } else if (this.food.equalsIgnoreCase("Torta")) {
      this.chef.bakeCake();
    } else {
      // niente
    }
  }

}
