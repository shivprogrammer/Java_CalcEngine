public class Flight {
  private int passengers, flightNumber, seats = 150;
  private char flightClass;

  public Flight() {

  }

  public Flight(int flightNumber) {
    this.flightNumber = flightNumber;
  }

  public Flight(char flightClass) {
    this.flightClass = flightClass;
  }
}
