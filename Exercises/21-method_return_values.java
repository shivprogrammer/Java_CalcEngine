public class Flight {
  private int passengers;
  private int seats;

  public boolean hasRoom(Flight f2) {
    int total = passengers + f2.passengers;
    return total <= seats;
  }

  public Flight createNewWithBoth(Fight f2) { // notice that this method returns a Flight object
    Flight newFlight = new Flight();
    newFlight.seats = seats;
    newFlight.passengers = passengers + f2.passengers;
    return newFlight;
  }
}
