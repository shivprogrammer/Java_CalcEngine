Object[] stuff = new Object[3];
stuff[0] = new Flight();
stuff[1] = new Passenger(0, 2);
stuff[2] = new CargoFlight();

Object o = new Passenger();
o = new Flight[5]; // Because arrays are classes, we can assign an array to a variable of type object. Now we wouldn't have access to any of the array characteristics of it, but we can hold the refernece.
o = new CargoFlight();
o.add1Package(1.0, 2.5, 3.0); // this won't work, because the reference o doesn't know anything about this idea of add1Package

if (o instanceof CargoFlight) { // good practice, we're running a programmatic check that o actually is a CargoFlight
  CargoFlight cf = (CargoFlight)o; // we are adding an explicit cast that says I know that there is a CargoFlight in o
  cf.add1Package(1.0, 2.5, 3.0); // Using cf, we CAN call add1Package because of the explicit cast assignment we used in the line above
}
