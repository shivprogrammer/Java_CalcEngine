public class Flight {
  // other members elided for clarity
  int seats = 150;

  public class add1Passengers() {
    if (hasSeating())
      passengers += 1;
    else
      handleTooMany();
  }

  private boolean hasSeating() {
    return passengers < seats;
  }
}

public class CargoFlight extends Flight {
  // other members elided for clarity
  int seats = 12;
}

Flight f1 = new Flight();
System.out.println(f1.seats); // returns 150

CargoFlight cf = new CargoFlight;
System.out.println(cf.seats); // returns 12, so the CargoFlight seats field is hiding the seats field

Flight f2 = new CargoFlight();
System.out.println(f2.seats); // returns 150, because the seats value of 12 is only visible when the instance being worked with as a CargoFlight, and because the reference of f2 is of type Flight, it doesn't know anything about the seats value of 12, it only knows the seats value of 150
