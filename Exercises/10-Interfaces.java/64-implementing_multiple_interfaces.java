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

public class Person {
  // other members elided for clarity
  private String name;
}

public class CrewMember extends Person {
  // members elided for clarity
}

public class Passenger extends Person implements Comparable<Passenger> {
  // members elided for clarity
}
