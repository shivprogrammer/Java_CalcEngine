public class Flight implements Comparable {
  // other members elided for clarity
  private int flightTime; // minutes past midnight

  public int compareTo(Object o) {
    Flight f = (Flight) o;
    if (flightTime < f.flightTime)
      return -1;
    else if (flightTime > f.flightTime)
      return 1;
    else
      return 0;
  }
}
