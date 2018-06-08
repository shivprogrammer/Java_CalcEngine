public class Flight {
  // other members elided for clarity
  private int flightNumber;

  public Flight() {}

  public Flight(int flightNumber) {
    this.flightNumber = flightNumber;
  }
}

Flight f175 = new Flight(175);

public class CargoFlight extends Flight {
  // other members
}

CargoFlight cf = new CargoFlight();
CargoFlight cf294 = new CargoFlight(294); // error, even though our base class Flight has a constructor that accepts a flightNumber, CargoFlight does not
