public class Passenger {
  private final int freeBags; // by using the word final, any attempt to set freeBags after its been set in the constructor will actually result in a compile error
  // other members elided for clarity

  public Passenger(int freeBags) {
    this.freeBags = freeBags;
  }
}

public class Flight {
  static final int MAX_FAA_SEATS = 550; // no object instance can create this; MAX_FAA_SEATS will have a value of 550 in ALL Flight instances
  private int seats;
  // other members elided for clarity

  public void setSeats(int seats) {
    if (seats < MAX_FAA_SEATS)
      this.seats = seats;
    else
      // handle error
  }
}
