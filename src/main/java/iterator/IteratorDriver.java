package iterator;

public class IteratorDriver {
    public static void main(String[] args) {
        SpezieCollection spezieCollection = new SpezieCollection();
        Iterator iterator1 = spezieCollection.createIterator();
        System.out.println("Iterator scorre la collezione di spezie: ");
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }

        ErbeCollection erbeCollection = new ErbeCollection();
        Iterator iterator2 = erbeCollection.createIterator();
        System.out.println("\nIterator scorre la collezione di erbe: ");
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }

    }
}
