public class Flight {
  private int passengers;
  private int seats;

  public Flight() {
    seats = 150;
    passengers = 0;
  }

  public void addPassenger() {
    if (passengers < seats)
      passengers += 1;
    else
      handleTooMany();
  }
  private void handleTooMany() {
    System.out.println("Too many");
  }
}

Flight flight1 = new Flight();
System.out.println(flight1.passengers); // compile time error, since passengers is a private int

flight1.addPassenger(); // success
flight1.handleTooMany(); // compile time error
