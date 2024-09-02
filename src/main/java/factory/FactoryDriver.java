package factory;

import java.util.ArrayList;

public class FactoryDriver {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        ArrayList<Shape> shapes = new ArrayList();
        Shape shape2 = shapeFactory.getShape("triangle");
        Shape shape1 = shapeFactory.getShape("square");
        Shape shape3 = shapeFactory.getShape("octagon");
        shapes.add(shape1);
        shapes.add(shape2);
        shapes.add(shape3);
        for (Shape shape : shapes) {
            System.out.println("A " + shape.getName() + " has " + shape.getNumberSides() + " sides");
            shape.draw();
        }




    }
}
