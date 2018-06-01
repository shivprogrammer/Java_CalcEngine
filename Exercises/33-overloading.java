public class Flight {

  int seats = 150, passengers;
  int totalCheckedBags;
  int maxCarryOns = seats * 2, totalCarryOns;

  public void add1Passenger() {
    if (passengers < seats)
      passengers += 1;
    else
      handleTooMany();
  }

  private boolean hasSeating() {
    return passengers < seats;
  }

  private boolean hasCarryOnSpace(int carryOns) {
    return totalCarryOns + carryOns <= maxCarryOns;
  }
}
