public class Passenger implements Comparable {
  // other members elided for clarity
  private int memberLevel; // 3 (1st priority, think of platinum member), 2 (gold member), 1 (silver member)
  private int memberDays;
  public int compareTo(Object o) {
    Passenger p = (Passenger) o;
  }
}
