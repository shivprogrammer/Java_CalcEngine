class Flight {
  // other members elided for clarity
  private int flightNumber;
  private char flightClass;

  @Override
  public boolean equals (Object o) {
    if (super.equals(o)) // when we call into the Flight implementation of equals, the first thing that we do is call into our base class implementation, which compares to see if both references point to the same object. If they do, we just exit out of here. Otherwise, we do the other tests we have buitl inside of our equals implementation
      return true;

    if (!(o instanceOf Flight))
      return false;

    Flight other = (Flight) o;
    return
      flightNumber == other.flightNumber && flightClass == flightClass;
  }
}

Flight f1 = new Flight(175);
Flight f2 = f1; // f1 and f2 are pointing to the exact same Flight instance

if (f1.equals(f2))
  // do something
