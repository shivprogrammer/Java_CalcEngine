Object[] stuff = new Object[3];
stuff[0] = new Flight();
stuff[1] = new Passenger(0, 2);
stuff[2] = new CargoFlight();

Object o = new Passenger();
o = new Flight[5]; // Because arrays are classes, we can assign an array to a variable of type object. Now we wouldn't have access to any of the array characteristics of it, but we can hold the refernece.
