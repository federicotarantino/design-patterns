package factory;

public class Square implements Shape{
    private final static int numberSides = 4;
    private final static String shapeName = "square";

    public Square() {
    }

    @Override
    public int getNumberSides() {
        return numberSides;
    }

    @Override
    public String getName() {
        return shapeName;
    }

    @Override
    public void draw() {
        System.out.println(" --");
        System.out.println("|  |");
        System.out.println(" --");

    }
}
