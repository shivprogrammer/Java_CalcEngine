public class Flight implements Comparable(Flight) {
  // other members elided for clarity
  private int flightTime;
  private CrewMember[] crew;
  private Passenger[] roster;
  public int compareTo(Flight f) {
    Flight f = (Flight) o;
    return flightTime - f.flightTime;
  }
}

public class Passenger implements Comparable<Passenger> {
  // members elided for clarity
}

public class CrewMember {
  // members elided for clarity
}
