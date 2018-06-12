public class Flight {
  private int passengers, flightNumber, seats = 150;
  private char flightClass;
  private boolean[] isSeatAvailble;

  // the brackets with nothing else preceding them turn the code inside them into an initialization block, and will automatically be executed at the beginning of each one of our constructors
  {
    isSeatAvailable = new Boolean[seats];
    for (int i = 0; i < seats; i++)
      isSeatAvailable[i] = true;
  }

  public Flight() {}

  public Flight(int flightNumber) {
    this.flightNumber = flightNumber;
  }

  public Flight(char flightClass) {
    this.flightClass = flightClass;
  }
}
