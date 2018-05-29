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
