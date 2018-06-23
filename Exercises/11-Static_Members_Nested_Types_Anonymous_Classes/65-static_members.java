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
System.out.println(Flight.getAllPassengers()); // returns 0

Flight lax045 = new Flight();
lax045.add1Passenger(); // allPassengers == 1, lax045 passengers == 1
lax034.add1Passenger(); // allPassengers = 2, lax045 passengers == 2
