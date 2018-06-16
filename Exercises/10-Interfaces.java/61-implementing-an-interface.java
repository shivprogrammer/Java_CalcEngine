public class Flight implements Comparable {
  // other members elided for clarity
  private int flightTime; // minutes past midnight

  public int compareTo(Object o) {
    Flight f = (Flight) o;
    return flightTime - f.flightTime;
  }
}

Flight lax045 = new Flight();
lax045.setFlightTime(45);

Flight slc015 = new Flight();
slc015.setFlightTime(15);

Flight nyc030 = new Flight();
nyc030.setFlightTime(30);

Flight[] flights = {lax045, slc015, nyc030};
Arrays.sort(flights); // returns slc015, nyc030, lax045
