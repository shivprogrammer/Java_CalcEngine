public abstract class Pilot {
  private Flight currentFlight;

  public void fly(Flight f) {
    if (canAccept(f))
      currentFlight = f;
    else
      handleCantAccept();
  }

  public abstract boolean canAccept(Flight f); // by saying abstract we're saying we're not going to provide an implementation

  private void handleCantAccept() {
    System.out.println("Can't Accept");
  }
}

public class CargoOnlyPilot extends Pilot {
  @Override
  public boolean canAccept(Flight f) {
    return f.getPassengers() == 0;
  }
}
