Flight f1 = new Flight(175);
Flight f2 = new Flight(175);

if (f1 == f2)
  // do something

// this will resolve to FALSE. The == operator performs what's called a reference equals test, in other words do both of these references point to the exact same object instance. So when you use an == operator, it only resolves to true with reference types if they're both pointing to the same object

if (f1.equals(f2))
  // do something

// this will also return FALSE. The equals operator also performs a reference equals test, in other words it does the same thing as the == operator. It only resolves to true if both references point to the exact same object instance

class Flight {
  // other members elided for clarity
  private int flightNumber;
  private char flightClass;
  // we either have a flightNumber with no flightClass, or a flightClass with no flightNumber

  @Override
  public boolean equals(Object o) {
    if (!(o instanceOf Flight))
      return false;

    Flight other = (Flight) o; // Because o is declared as an Object, it will only have access to members that are known by Object, it won't have access to the Flight members. So what we need to do is take that o, cast to a Flight and put it into a reference of type Flight. So now "other" will have access to the Flight information from f2

    return
      flightNumber == other.flightNumber && flightClass == other.flightClass;
  }
}

if (f1.equals(f2)) // now this will resolve to TRUE, because f1 and f2 have the same flightNumber
  // do something

Passenger p = new Passenger();
if (f1.equals(p))
  // do something

// since equals accepts an Object as its parameter type, its valid for p to be passed into that parameter o, but what's going to happen now when we try to cast o into a Flight is its going to create an ERROR

// after adding in the o instanceOf Flight check, now the f1.equals(p) will return FALSE
