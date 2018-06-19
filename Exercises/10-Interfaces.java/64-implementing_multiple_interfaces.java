public class Flight implements Comparable<Flight>, Iterable<Person> {
  // other members elided for clarity
  private int flightTime;
  private CrewMember[] crew;
  private Passenger[] roster;
  public int compareTo(Flight f) {
    Flight f = (Flight) o;
    return flightTime - f.flightTime;
  }
  public Iterator<Person> iterator() {

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

public interface Iterable<T> {
  Iterator<T> iterator();
}

public interface Iterator<T> {
  boolean hasNext();
  T next();
}

public class FlightIterator implements Iterator<Person> {
  private CrewMember[] crew;
  private Passenger[] roster;
  private int index = 0;
  public FlightIterator(CrewMember[] crew, Passenger[] roster) {
    this.crew = crew;
    this.roster = roster;
  }
  boolean hasNext() {
    return index < (crew.length + roster.length);
  }
  public Person next() {
    Person p = (index < crew.length) ? crew[length] : roster[index - crew.length];
    index++;
    return p;
  }
}
