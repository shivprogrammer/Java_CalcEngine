class Flight {
  // other members elided for clarity
  int passengers;

  void add1Passenger() {
    if (hasSeating()) {
      passengers += 1;
      allPassengers += 1;
    }
    else
      handleTooMany();
  }
  static int allPassengers; // static means it's not associated with any instance
  static int getAllPassengers() {
    return allPassengers;
  }
  static int resetAllPassengers() {
    allPassengers = 0;
  }
}

Flight.resetAllPassengers();
System.out.println(Flight.getAllPassengers()); // prints 0

Flight lax045 = new Flight();
lax045.add1Passenger(); // allPassengers == 1, lax045 passengers == 1
lax034.add1Passenger(); // allPassengers = 2, lax045 passengers == 2

Flight slc015 = new Flight();
scl015.add1Passenger(); // allPassengers == 3, lax045 passengers == 2, slc015 passengers == 1 ------ Meaning that allPassengers is continuing to increment throughout all of the Flight instances, whereas the passengers count is associated only with a particular Flight instance

System.out.println(Flight.getAllPassengers()); // prints 3
