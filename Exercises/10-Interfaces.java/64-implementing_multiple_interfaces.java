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
    return new FlightIterator(crew, roster);
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

//////// Use cases
Flight lax045 = new Flight(45);
// Add Crew members:
//  Pilot Patty, CoPilot Karl, Marshal Mary
// Add Passengers:
//  Bob, Jane, Steve, Lisa
for (Person p : lax045)
  System.out.println(p.getName());
/*
Pilot Patty
CoPilot Karl
Marshal Mary
Bob
Jane
Steve
Lisa
*/

// General run down of how this works
Iterable<Person> laxIterable = lax045;
Iterator<Person> persons = laxIterable.iterator();
while(persons.hasNext()) {
  Person p = persons.next();
  System.out.println(p.getName());
}
