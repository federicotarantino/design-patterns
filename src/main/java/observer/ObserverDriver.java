package observer;

public class ObserverDriver {

  private static final AddressBook book = new AddressBook();

  public static void main(String[] args) {
    Persona p = new Persona();
    p.setNome("Mario Rossi");
    p.setEmail("mario@gmail.com");
    p.setPhone("3330011222");

    book.attach(new SpammerMail());
    book.attach(new SpammerTelefonico());
    book.insert(p);
  }

}
