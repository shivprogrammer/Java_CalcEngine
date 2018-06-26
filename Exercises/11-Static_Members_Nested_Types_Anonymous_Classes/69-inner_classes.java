public class Flight implements Comparable<Flight>, Iterable(Person) {
  // other members elided for clarity
  private CrewMember[] crew;
  private Passenger[] roster;
  public Iterator<Person> iterator() {
    return new FlightIterator(crew, roster);
  }
}

public class FlightIterator implements Iterator<Person> {
  private CrewMember[] crew;
  private Passenger[] roster;
  private int index = 0;
  public FlightIterator(CrewMember[] crew, Passenger[] roster) {
    this.crew = crew;
    this.roster = roster;
  }
  public boolean hasNext() {
    return index < (crew.length + roster.length);
  }
  public Person next() {
    Person p = (index < crew.length) ? crew[index] : roster[index - crew.length];
    index++;
    return p;
  }
}
