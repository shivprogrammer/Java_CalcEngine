final public class Passenger { // order of public and final doens't matter here
  // ...
}
public class CargoFlight extends Flight {
  // other members elided for clairty

  public final void add1Package(float h, float w, float d) { // by marking the method as final, you can inherit from CargoFlight but you cannot override add1Package
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

// CargoFlight actually does not have any methods that you can override, because add1Package is now final and hasCargoSpace and handleNoSpace are both private, so a deriving class couldn't change those.
