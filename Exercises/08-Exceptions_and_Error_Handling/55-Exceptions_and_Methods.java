// C:\PassengerList.txt
2 Wilson
4 Rodriguez
7 Smith
4 Sharma

//////////////
public class Flight {
  int passengers;
  // other members elided for clarity
  public void addPassengers(String filename) throws IOException { // if we didn't put the throws on, the compiler would actually complain that we weren't dealing with the exception
    BufferedReader reader = null;
    reader = new BufferedReader(new FileReader(filename));
    String line = null;
    while ((line = reader.readLine()) != null) {
      String[] parts = line.split(" ");
      passengers += Integer.valueOf(parts[0]);
    }
  }
}
