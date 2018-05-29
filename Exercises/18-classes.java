class Flight {
  int passengers;
  int seats;

  void addPassenger() {
    if (passengers < seats)
      passengers += 1;
  }
}
