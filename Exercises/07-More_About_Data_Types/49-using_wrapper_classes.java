Object[] stuff = new Object[3];
stuff[0] = new Flight();
stuff[1] = new Passenger(0, 2);
stuff[2] = 100;

public class Flight {
  int flightNumber;
  char flightClass;
  // other members elided for clarity

  @Override
  public string toString() {
    if (flightNumber > 0)
      return "Flight #" + flightNumber;
    else
      return "Flight Class " + flightClass;
  }
}
