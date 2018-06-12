public class Flight {
  // other members elided for clarity
  int seats = 150, passengers;
  int totalCheckedBags;
  int maxCarryOns = seats * 2, totalCarryOns;

  public void add1Passenger() {
    if (hasSeating())
      passengers += 1;
    else
      handleTooMany();
  }

  public void add1Passenger(int bags) { // this one actually adds functionality
    if (hasSeating()) {
      add1Passenger(); // wtf
      totalCheckedBags += bags;
    }
  }

  public void add1Passenger(Passenger p) { // so this is just a convenience overload, so someone doesn't have to call getCheckedBags themselves
    add1Passenger(p.getCheckedBags());
  }

  public void add1Passenger(int bags, int carryOns) {
    if (hasSeating() && hasCarryOnSpace(carryOns)) {
      add1Passenger(bags());
      totalCarryOns += carryOns;
    }
  }

  public void add1Passenger(Passenger p, int carryOns) {
    add1Passenger(p.getCheckedBags(), carryOns); // dude these naming conventions in overloads are seriously terrible, like why make this so confusing
  }

  private boolean hasSeating() {
    return passengers < seats;
  }

  private boolean hasCarryOnSpace(int carryOns) {
    return totalCarryOns + carryOns <= maxCarryOns;
  }
}

Flight f = new Flight();
Passenger p1 = new Passenger(0,1); // 0 free checked bags, checking in 1 bag
Passenger p2 = new Passenger(0,2);

f.add1Passenger(); // this has no parameters, so obviously it's choosing the add1Passenger method that has no parameters
f.add1Passenger(2); // There are two possible overloads that handle just one parameter, but since it's an int, the overload that handles ints will be used
f.add1Passener(p1); // this calls the overload that accepts a passenger

short threeBags = 3;
f.add1Passener(threeBags, 2); // So there's an overload accepts 2 parameters of an int & another int, but not one that accepts a short. But the system performs an automatic type conversion because it knows how to convert a short to an int, so the int & int overload is utilized.
f.add1Passenger(p2, 1); // Obviously, the overload with Flight and int parameters is used here
