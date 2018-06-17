public class Passenger implements Comparable<Passenger> {
  // other members elided for clarity
  private int memberLevel; // 3 (1st priority, think of platinum member), 2 (gold member), 1 (silver member)
  private int memberDays;
  public int compareTo(Passenger o) {
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
