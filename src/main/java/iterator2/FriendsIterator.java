package iterator2;

import java.util.List;
import java.util.stream.Collectors;

public class FriendsIterator implements ContactIterator {

  private List<Contact> contacts;
  public int currentPosition = 0;

  public FriendsIterator(SocialNetwork social){
    List<Contact> allContacts = social.getContacts();
    contacts = allContacts.stream()
            .filter(c -> c.getGroups().contains(Contact.FriendGroup.FRIEND)).collect(Collectors.toList());
  }

  @Override
  public boolean hasNext() {
    return currentPosition < contacts.size();
  }

  @Override
  public Contact next() {
    Contact contact = null;
    if (hasNext()) {
      contact = contacts.get(currentPosition);
      currentPosition++;
    }
    return contact;
  }

}
