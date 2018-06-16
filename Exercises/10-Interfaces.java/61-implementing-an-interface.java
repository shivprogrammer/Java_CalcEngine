public class Flight implements Comparable {
  // other members elided for clarity
  private int flightTime; // minutes past midnight

  public int compareTo(Object o) {
    Flight f = (Flight) o;
    return flightTime - f.flightTime;
  }
}
