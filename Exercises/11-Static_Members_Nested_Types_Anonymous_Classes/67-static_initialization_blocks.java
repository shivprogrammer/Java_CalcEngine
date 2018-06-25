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

  static {
    BufferedReader reader = null;
    try {
      reader = new BufferedReader(. . .);
      String line = null;
      int idx = 0;
      pool = new CrewMember[10];
      while ((line = reader.readLine()) != null) {
        String[] parts = line.split(",");
        FlightCrewJob job = FlightCrewJob.valueOf(parts[0]);
        pool[idx] = new CrewMember(job);
        pool[idx].setName(parts[1]);
        idx++;
      }
    } catch (IOException e) {
      // handle error
    }
  }
}

CrewMember p = CrewManager.FindAvailable(FlightCrewJob.Pilot);

CrewMember c = CrewManager.FindAvailable(FlightCrewJob.CoPilot);

CrewMember a = CrewManager.FindAvailable(FlightCrewJob.AirMarshal);
