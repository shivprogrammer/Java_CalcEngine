public class Flight {
  // other members elided for clarity

  public void addPassengers(Passenger... list) { // the ellipses now says that list will be a varying number of passenger references.
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

// Below is a very cumbersome programmatic process
Flight f = new Flight();
Passenger janet = new Passenger(0,1);
Passener john = new Passenger(0,2);
f.addPassengers(
  new Passenger[] { janet, john });

Passenger fred = new Passenger(0,2);
Passenger sarah = new Passenger(0,2);
Passenger susie = new Passenger(0,0);

f.addPassengers(
  new Passenger[] { fred, sarah, susie });

// AFTER changing the paramter of addPassengers from Passenger[] to Passenger... you can now add Passengers like so:
f.addPassengers(janet, john);
f.addPassengers(fred, sarah, susie);
