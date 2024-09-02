package iterator2;

import java.util.List;

public class Contact {

  private String name;
  private String surname;
  private List<FriendGroup> groups;

  Contact(String name, String surname, List<FriendGroup> groups) {
    this.name = name;
    this.surname = surname;
    this.groups = groups;
  }

  public String getName() {
    return name;
  }

  public String getSurname() {
    return surname;
  }

  public List<FriendGroup> getGroups() {
    return groups;
  }

  public enum FriendGroup{
    FRIEND, COLLEAGUE, FAMILY
  }

}
