package singleton;

public class Singleton {

    // static reference to the instance
    private static Singleton singleton = new Singleton();

    // private constructor
    private Singleton() {}

    // static accessor method
    public static Singleton getInstance(){
        return singleton;
    }

    public void printClass() {
        System.out.println(Singleton.getInstance() + " is my only instance");
    }

}
