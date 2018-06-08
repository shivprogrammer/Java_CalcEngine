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
  // other members elided for clarity
  float maxCargoSpace = 1000.0f;

  public CargoFlight(int flightNumber) {
    super(flightNumber); // we are delegating the work of this method to the base class of Flight by usisg the super notation
  }

  public CargoFlight(int flightNumber, float maxCargoSpace) {
    this(flightNumber); // MUST BE FIRST LINE, and using this keyword we are referencing the CargoFlight method above, which is then calling into the base class.
    this.maxCargoSpace = maxCargoSpace;
  }

  public CargoFlight() {} // this is actually calling into the Flight class' constructor, because we did not specify any base class constructor

  public CargoFlight(float maxCargoSpace) {
    this.maxCargoSpace = maxCargoSpace;
  }
}

CargoFlight cf = new CargoFlight();
CargoFlight cf294 = new CargoFlight(294); // error, even though our base class Flight has a constructor that accepts a flightNumber, CargoFlight does not

// AFTER CREATING CARGOFLIGHT METHOD THAT HAS FLIGHTNUMBER FOR PARAMETER
CargoFlight cf294 = new CargoFlight(294); // success
CargoFlight cf85 = new CargoFlight(85, 2000.0f);

// So now this line of code no longer works
CargoFlight cf = new CargoFlight();

// AFTER we add in the method to CargoFlight which accepts no parameters, this will now work
CargoFlight cf = new CargoFlight();

CargoFlight cfBig = new CargoFlight(5000.0f); // before this calls up to the CargoFlight constructor, it actually calls to the Flight class constructor that has no arguments. So the base class constructor is always called first, even when we don't specify one
