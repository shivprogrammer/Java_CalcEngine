final public class Passenger { // order of public and final doens't matter here
  // ...
}
public class CargoFlight extends Flight {
  // other members elided for clairty

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
