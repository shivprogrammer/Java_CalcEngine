CrewMember p = CrewManager.FindAvailable(FlightCrewJob.Pilot);

public class CrewManager {
  private final static String FILENAME = "...";
  public static CrewMember[] pool;
  public static CrewMember
    FindAvailable (FlightCrewJob job) {
      CrewMember cm = null;
      for (int i = 0; i < pool.length; i++) {
        if (pool[i] != null && pool[i].job == job) {
          cm = pool[i];
          pool[i] = null;
          break;
        }
      }
      return cm;
    }
// other members temporarily elided
} // class CrewManager
