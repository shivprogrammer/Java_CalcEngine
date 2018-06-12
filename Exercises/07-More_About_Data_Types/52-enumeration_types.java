public enum FlightCrewJob {
  Pilot,
  CoPilot,
  FlightAttendant,
  AirMarshal
}

public class CrewMember {
  private FlightCrewJob job;
  // other members elided for clarity

  public CrewMember (FlightCrewJob job) {
    this.job = job;
  }

  public void setJob(FlightCrewJob job) {
    this.job = job;
  }
}
