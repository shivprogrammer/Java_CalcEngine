// C:\PassengerList.txt
2 Wilson
4 Rodriguez
7 Smith
4 Sharma

//////////////
public class Flight {
  int passengers;
  // other members elided for clarity
  public void addPassengers(String filename) {
    BufferedReader reader = null;
    reader = new BufferedReader(new FileReader(filename));
    String line = null;
    while ((line = reader.readLine()) != null) {
      String[] parts = line.split(" ");
      passengers += Integer.valueOf(parts[0]);
    }
  }
}
