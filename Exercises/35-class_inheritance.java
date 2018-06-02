public class Flight {
  // other members elided for clarity
  public void add1Passenger(Passener p) { ... }
}

public class CargoFlight extends Flight {
  float maxCargoSpace = 1000.0f;
  float usedCargoSpace;

  public void add1Package(float h, float w, float d) {
    double size = h * w * d;
    if (hasCargoSpace(size))
      usedCargoSpace += size;
    else
      handleNoSpace();
  }

  private boolean hasCargoSpace(float size) {
    return usedCargoSpace + size <= maxCargoSpace;
  }

  private void handleNoSpace() {
    System.out.println("Not enough space");
  }
}

CargoFlight cf = new CargoFlight();
cf.add1Package(1.0, 2.5, 3.0); // so you have these extended capabilities of the CargoFlight class
Passenger jane = new Passenger(0,2);
cf.add1Passenger(jane); // as well as the base class capabilities

Flight f = new CargoFlight();
Passenger jane = new Passenger(0,2);
f.add1Passenger(jane);
f.add1Package(1.0, 2.5, 1.5); // while a CargoFlight knows how to add a package, a Flight doesn't. So this wouldn't be a valid call, because we can only access methods that are visibile to the reference type.

Flight[] squadron = new Flight[5];
squadron[0] = new Flight();
squadron[1] = new CargoFlight(); // notice how you can mix and match both Flight and CargoFlight in this array
squadron[1] = new CargoFlight();
squadron[1] = new Flight();
squadron[1] = new CargoFlight();
// the beauty of this is that you can loop through this doing all the Flight based stuff. For CargoFlights you may want to do some extended things but it allows us to very easily group these actions
