package command;

public class CommandDriver {
    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();
        Command addItem = new AddCommand(cart);
        Command removeItem = new RemoveCommand(cart);

        Invoker invoker = new Invoker();
        invoker.addAndExecute("Add item to shopping cart", addItem);
        invoker.addAndExecute("Remove item from shopping cart", removeItem);
        invoker.listCommands();
    }
}
