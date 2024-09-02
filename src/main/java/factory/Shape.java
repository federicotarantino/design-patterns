package factory;

public interface Shape {

    public int getNumberSides();

    public String getName();

    public void draw();

    // potrei creare un metodo "getDesc" generico per descrivere Shape. interface -> abstract class
}
