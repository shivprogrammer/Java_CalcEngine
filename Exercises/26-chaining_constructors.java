public class Passenger {
  // fields and methods elided for clarity

  public Passenger() {

  }

  public Passenger(int freeBags) {
    this.freeBags = freeBags;
  }

  public Passenger(int freeBags, int checkedBags) {
    this(freeBags); // this will actually call the constructor above
    this.checkedBags = checkedBags;
  }
}


Passenger jane = new Passenger(2);
jane.setCheckedBags(3);
