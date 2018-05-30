public class Flight {
  private int passengers;
  private int seats;

  public int getSeats() {
    return seats;
  }

  public void setSeats(int seats) {
    this.seats = seats;
  }
}

Flight slcToNyc = new Flight();
slcToNyc.setSeats(150);
System.out.println(slcToNyc.getSeats()); // returns 150
