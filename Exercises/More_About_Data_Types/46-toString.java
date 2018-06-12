Flight myFlight = new Flight(175);
System.out.println(
  "My flight is " + myFlight); // returns "My flight is com.pluarlsight.foo.Flight@74a14482"
  // com.pluralsight.foo.Flight is the fully qualified class name, including the package its in
  // 74a14482 are the values that are returned by the hashcode method

public class Flight {
  int flightNumber;
  char flightClass;
  // other members elided for clarity

  @Override
  public String toString() { // wow you can override toString? Boss
    if (flightNumber > 0)
      return "Flight #" + flightNumber;
    else
      return "Flight Class " + flightClass;
  }
}

System.out.println(
  "My flight is " + myFlight); // NOW you return "My Flight is Flight #175"
