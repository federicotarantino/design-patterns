package iterator2;

import java.util.ArrayList;
import java.util.List;

public abstract class SocialNetwork {
  
  private final List<Contact> contacts = new ArrayList<>();

  public void addContact(Contact contact) {
    contacts.add(contact);
  }

  public List<Contact> getContacts() {
    return contacts;
  }

  public abstract ContactIterator createFriendsIterator();

  public abstract ContactIterator createFamilyIterator();

}
