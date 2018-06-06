class Flight {
  // other members elided for clarity
  private int flightNumber;
  private char flightClass;

  @Override
  public boolean equals (Object o) {
    if (!(o instanceOf Flight))
      return false;

    Flight other = (Flight) o;
    return
      flightNumber == other.flightNumber && flightClass == flightClass;
  }
}
