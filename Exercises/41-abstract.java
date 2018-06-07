public class Pilot {
  private Flight currentFlight;

  public void fly(Flight f) {
    if (canAccept(f))
      currentFlight = f;
    else
      handleCantAccept();
  }

  private void handleCantAccept() {
    System.out.println("Can't Accept");
  }
}
