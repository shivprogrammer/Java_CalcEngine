public class Passenger implements Comparable {
  // other members elided for clarity
  private int memberLevel; // 3 (1st priority, think of platinum member), 2 (gold member), 1 (silver member)
  private int memberDays;
  public int compareTo(Object o) {
    Passenger p = (Passenger) o;
    if (memberLevel > p.memberLevel)
      return -1;
    else if (memberLevel < p.memberLevel)
      return 1;
    else {
      if (memberDays > p.memberDays)
        return -1;
      else if (memberDays < p.memberDays)
        return 1;
      else
        return 0;
    }
  }
}

Passenger bob = new Passenger();
bob.setLevelAndDays(1, 180);

Passenger jane = new Passenger();
jane.setLevelAndDays(2, 90);

Passenger steve = new Passenger();
steve.setLevelAndDays(2, 180);

Passenger lisa = new Passenger();
lisa.setLevelAndDays(3, 730);

Passenger[] passengers = 
