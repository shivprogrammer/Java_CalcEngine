public class Passenger {
  private int checkedBags;
  private int freeBags;
  // accessors and mutators elided for clarity
  private double perBagFee;

  public Passenger() { // in order for Bob to not have a compile time error, this must now be added as another valid constructor. It does not need to have code in it, but you have to specify that that a Passenger instance can be created with no arguments.

  }

  public Passenger (int freeBags) { // After creating this, bob is no longer valid because you are not providing the argument of free bags.
    this.freeBags = freeBags;
  }
}

Passenger bob = new Passenger(); // this will still work even though no constructor has been explicitly created due to the way that java works.
bob.setCheckedBags(3);

Passenger jane = new Passenger(2);
jane.setCheckedBags(3);
