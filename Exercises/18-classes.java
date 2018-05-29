class Flight {
  int passengers;
  int seats;

  Flight() {
    seats = 150;
    passengers = 0;
  }

  void addPassenger() {
    if (passengers < seats)
      passengers += 1;
  }
}

Flight nycToSf;
nycToSf = new Flight();
Flight slcToDallas = new Flight();

slcToDallas.addPassenger();
