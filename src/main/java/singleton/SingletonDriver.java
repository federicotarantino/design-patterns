package singleton;

public class SingletonDriver {
    public static void main(String[] args) {
        // non posso istanziare l'oggetto con la riga seguente - costruttore private
        // Singleton newSingletonKo = new Singleton();
        Singleton newSingleton = Singleton.getInstance();
        newSingleton.printClass();


    }
}
