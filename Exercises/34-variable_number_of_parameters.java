public class Flight {
  // other members elided for clarity

  public void addPassengers(Passenger[] list) {
    if(hasSeating(list.length)) {
      passengers += list.length;
      for (Passenger passenger : list)
        totalCheckedBags += passenger.getCheckedBags();
    }
    else
      handleTooMany();
  }

  private boolean hasSeating(int count) {
    return passengers + count <= seats;
  }
}
