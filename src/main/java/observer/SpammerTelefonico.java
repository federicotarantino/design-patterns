package observer;

public class SpammerTelefonico implements Observer {

  @Override
  public void update(Object p) {
    Persona persona = (Persona) p;
    System.out.println("SMS di benvenuto per "+persona.getNome()+" al cell "+persona.getPhone());
  }
}
