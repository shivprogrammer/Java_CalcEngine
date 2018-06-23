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
}
