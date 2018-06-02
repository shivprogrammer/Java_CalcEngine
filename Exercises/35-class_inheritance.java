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
