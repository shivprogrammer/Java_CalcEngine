public class Flight {
  private int passengers;
  private int seats;

  public Flight() {
    seats = 150;
    passengers = 0;
  }

  public void addPassenger() {
    if (passengers < seats)
      passengers += 1;
    else
      handleTooMany();
  }
  private void handleTooMany() {
    System.out.println("Too many");
  }
}

Flight nycToSf;
nycToSf = new Flight();

Flight slcToDallas = new Flight();
slcToDallas.addPassenger();

Flight flight1 = new Flight();
Flight flight2 = new Flight();

flight2.addPassenger();
System.out.println(flight2.passengers); // returns 1
// after adding private access modifier to passengers, this would no longer be allowed and would produce a compile time error

flight2 = flight1;
System.out.println(flight2.passengers) // returns 0
// after adding private access modifier to passengers, this would no longer be allowed and would produce a compile time error

flight1.addPassenger();
flight1.addPassenger();

System.out.println(flight2.passengers) // RETURNS 2, NOTICE THAT ASSIGNMENTS ARE POINTING TO THE SAME OBJECT INSTANCE, INSTEAD OF CREATING A NEW COPY LIKE IN PRIMITIVE TYPES
// after adding private access modifier to passengers, this would no longer be allowed and would produce a compile time error
