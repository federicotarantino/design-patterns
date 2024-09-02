package iterator2;

public class Facebook extends SocialNetwork {

  @Override
  public ContactIterator createFriendsIterator() {
    return new FriendsIterator(this);
  }

  @Override
  public ContactIterator createFamilyIterator() {
    return new FamilyIterator(this);
  }
}
