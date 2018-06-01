public class Flight {
  // other members elided for clarity
  int seats = 150, passengers;
  int totalCheckedBags;
  int maxCarryOns = seats * 2, totalCarryOns;

  public void add1Passenger() {
    if (hasSeating())
      passengers += 1;
    else
      handleTooMany();
  }

  public void add1Passenger(int bags) { // this one actually adds functionality
    if (hasSeating()) {
      add1Passenger(); // wtf
      totalCheckedBags += bags;
    }
  }

  public void add1Passenger(Passenger p) { // so this is just a convenience overload, so someone doesn't have to call getCheckedBags themselves
    add1Passenger(p.getCheckedBags());
  }

  public void add1Passenger(int bags, int carryOns) {
    if (hasSeating() && hasCarryOnSpace(carryOns)) {
      add1Passenger(bags());
      totalCarryOns += carryOns;
    }
  }

  public void add1Passenger(Passenger p, int carryOns) {
    add1Passenger(p.getCheckedBags(), carryOns); // dude these naming conventions in overloads are seriously terrible, like why make this so confusing
  }

  private boolean hasSeating() {
    return passengers < seats;
  }

  private boolean hasCarryOnSpace(int carryOns) {
    return totalCarryOns + carryOns <= maxCarryOns;
  }
}
