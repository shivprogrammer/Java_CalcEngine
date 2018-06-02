public class Flight {
  // other members elided for clarity
  @Override // no impact on run time, only used at compile time
  int getSeats() { return 12; }

  public class add1Passengers() {
    if (hasSeating())
      passengers += 1;
    else
      handleTooMany();
  }

  private boolean hasSeating() {
    return passengers < getSeats();
  }
}

public class CargoFlight extends Flight {
  // other members elided for clarity
  int getSeats() { return 12; }
}

Flight f1 = new Flight();
System.out.println(f1.seats); // returns 150

CargoFlight cf = new CargoFlight;
System.out.println(cf.seats); // returns 12, so the CargoFlight seats field is hiding the seats field

Flight f2 = new CargoFlight();
System.out.println(f2.seats); // returns 150, because the seats value of 12 is only visible when the instance being worked with as a CargoFlight, and because the reference of f2 is of type Flight, it doesn't know anything about the seats value of 12, it only knows the seats value of 150

f2.add1Passenger(); // this hits add1Passenger from the Flight class, and which would allow us to add 150 passengers that only has 12 seats
cf.add1Passenger(); // even though this is type CargoFlight (instead of Flight like f2), we face the same problem because add1Passenger from Flight only knows the seat value of 150.

////// AFTER CHANGING SEATS FIELD TO GETSEATS METHOD IN FLIGHT AND CARGOFLIGHT CLASSES //////
Flight f1 = new Flight();
System.out.println(f1.getSeats()); // returns 150

CargoFlight cf = new CargoFlight();
System.out.println(cf.getSeats()); // returns 12

Flight f2 = new CargoFlight();
System.out.println(f2.getSeats()); // Because the getSeats method from CargoFlight OVERRIDES the getSeats method from Flight, we will now get the appropriate value of 12

f2.add1Passenger(); // this time, when we call add1Passenger and we get into hasSeating, when it calls getSeats, because the instance is of type CargoFlight, the implementation of getSeats inside of CargoFlight is actually what gets called, returning the appropriate value of 12. So it would only allow us to add 12 passengers.
cf.add1Passenger(); // The method in the base class is actually being overriden assuring that the appropriate method implementation is called based on the type of object created, not the type of reference used
