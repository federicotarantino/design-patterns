package observer;

public class SpammerMail implements Observer {

  @Override
  public void update(Object p) {
    Persona persona = (Persona) p;
    System.out.println("Mail di benvenuto per "+persona.getNome()+" al cell "+persona.getEmail());
  }
}
