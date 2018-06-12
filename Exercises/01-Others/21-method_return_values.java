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

Flight lax1 = new Flight();
Flight lax2 = new Flight();
// TODO: add passengers to both flights

Flight lax3;
if (lax1.hasRoom(lax2))
  lax3 = lax1.createNewWithBoth(lax2); // the seats variable will be taken from lax1, but the passengers will be the addition of lax1 and lax2
