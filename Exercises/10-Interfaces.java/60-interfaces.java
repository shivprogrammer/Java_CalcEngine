public class Passenger implements Comparable {
  // other members elided for clarity
  private int memberLevel; // 3 (1st priority), 2, 1
  private int memberDays;
  public int compareTo(Object o) {
    Passenger p = (Passenger) o;
  }
}
