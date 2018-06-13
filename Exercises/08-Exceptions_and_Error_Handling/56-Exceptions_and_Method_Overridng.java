public class CargoFlight extends Flight {
  // other members elided for clarity

  // if you are throwing an exception, then it HAS TO BE compatible with the base class method (addPassengers in the Flight class in this case)
  @Override
  public void addPassengers(String filename) { }
  // OR this exception works
  public void addPassengers(String filename) throws IOException { }
  // OR this exception works
  public void addPassengers(String filename) throws FileNotFoundException { }
}
