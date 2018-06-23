class Flight {
  // other members elided for clarity
  int passengers;

  void add1Passenger() {
    if (hasSeating()) {
      passengers += 1;
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
