package iterator2;

import java.util.Arrays;
import java.util.List;

public class Iterator2Driver {

  public static void main(String[] args) {
    // inizializzo il mio social
    Facebook social = new Facebook();
    social.addContact(new Contact("Mario", "Rossi", Arrays.asList(Contact.FriendGroup.FRIEND)));
    social.addContact(new Contact("Franco", "Bianchi", Arrays.asList(Contact.FriendGroup.FRIEND)));
    social.addContact(new Contact("Giulio", "Ricci", Arrays.asList(Contact.FriendGroup.FAMILY)));
    social.addContact(new Contact("Marco", "Verdi", Arrays.asList(Contact.FriendGroup.FAMILY)));
    social.addContact(new Contact("Matteo", "Bruno", Arrays.asList(Contact.FriendGroup.COLLEAGUE)));
    social.addContact(new Contact("Aldo", "Baglio", Arrays.asList(Contact.FriendGroup.COLLEAGUE)));

    sendMessageToFriends(social);
    sendMessageToFamily(social);
  }

  private static void sendMessageToFriends(SocialNetwork social){
    SocialSpammer spammer = new SocialSpammer();
    spammer.send(social.createFriendsIterator(), "Ciao %s %s, sei invitato alla festa tra amici");
  }

  private static void sendMessageToFamily(SocialNetwork social){
    SocialSpammer spammer = new SocialSpammer();
    spammer.send(social.createFamilyIterator(), "Ciao %s %s, sei invitato alla riunione di famiglia");
  }

}
