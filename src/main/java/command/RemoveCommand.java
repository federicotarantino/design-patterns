package command;

public class RemoveCommand implements Command {

    private ShoppingCart shoppingCart;
    public RemoveCommand(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    @Override
    public void execute() {
        shoppingCart.removeItem();
    }
}
