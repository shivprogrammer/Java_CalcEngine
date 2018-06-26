public class Passenger implements Comparable { // Passenger is the enclosing class
  // other members elided for clarity
  public static class RewardProgram { // this is the nested class
    private int memberLevel;
    private int memberDays;

    public int getLevel() { return level; }
    public void setLevel(int level) { this.level = level; }

    public int getMemberDays() { return memberDays; }
    public void setMemberDays(int days) { this.memberDays = days; }
  }
  private RewardProgram rewardProgram = new RewardProgram();
  public RewardProgram getRewardProgram() {
    return rewardProgram;
  }
}

Passenger steve = new Passenger();
steve.SetName("Steve");
steve.getRewardProgram().setLevel(3);
steve.getRewardProgram().setMemberDays(180);

Passenger.RewardProgram.platinum = new Passenger.RewardProgram();
platinum.setLevel(3);

if (steve.getRewardProgram().getLevel() == platinum.getLevel())
  System.out.println("Steve is platinum");
