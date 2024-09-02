package iterator2;

public class SocialSpammer {

  public void send(ContactIterator iterator, String message){
    while (iterator.hasNext()){
      Contact contact = iterator.next();
      String formattedMessage = String.format(message, contact.getName(), contact.getSurname());
      System.out.println(formattedMessage);
    }
  }
}
