public class Flight {
  private int passengers;
  private int seats;

  public boolean hasRoom(Flight f2) {
    int total = passengers + f2.passengers;
    if (total <= seats)
      return true;
    else
      return false
  }
}
