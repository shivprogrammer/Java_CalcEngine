public class Flight {
  private int passengers;
  private int seats;

  public boolean hasRoom(Flight f2) {
    int total = this.passengers + f2.passengers;
    return total <= seats;
  }

  public Flight createNewWithBoth(Flight f2) {
    Flight newFlight = new Flight();
    newFlight.seats = this.seats;
    newFlight.passengers = this.passengers + f2.passengers;
    return newFlight;
  }
}

Flight lax1 = new Flight();
Flight lax2 = new Flight();
// TODO: add passengers to both flights

Flight lax3 = null;
if lax1.hasRoom(lax2)
  lax3 = lax1.createNewWithBoth(lax2);

// Using the original value of null later on the program example:
if (lax3 != null)
  System.out.println("Flights combined");
