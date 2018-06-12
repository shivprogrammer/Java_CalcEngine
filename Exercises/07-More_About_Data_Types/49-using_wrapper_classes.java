Object[] stuff = new Object[3];
stuff[0] = new Flight();
stuff[1] = new Passenger(0, 2);
stuff[2] = 100;

public class Flight {
  Integer flightNumber;
  Character flightClass;
  // other members elided for clarity

  @Override
  public string toString() {
    if (flightNumber != null)
      return "Flight #" + flightNumber;
    else if (flightClass != null)
      return "Flight Class " + flightClass;
    else
      return "Flight identity not set ";
  }
}
