public class Flight implements Comparable(Flight) {
  // other members elided for clarity
  private int flightTime;

  public int compareTo(Flight f) {
    Flight f = (Flight) o;
    return flightTime - f.flightTime;
  }
}
