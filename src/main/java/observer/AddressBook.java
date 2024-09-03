package observer;

import java.util.ArrayList;
import java.util.List;

public class AddressBook extends Subject {

  private List<Persona> persone = new ArrayList<>();

  public void insert(Persona p) {
    System.out.println("Inserisco persona "+p.getNome()+" in rubrica");
    persone.add(p);
    setChanged(); // la prossima notifica avverrà
    notify(p); // notifica i ConcreteObserver
  }

}
