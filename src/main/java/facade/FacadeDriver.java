package facade;

public class FacadeDriver {

    public static void main(String[] args) {
        DirectionsFacade dirFacade = new DirectionsFacade();
        System.out.println(dirFacade.getAllDirections());
    }
}
