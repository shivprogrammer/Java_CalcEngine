public class Flight {
  int flightNumber;
  // accessor & mutator elided for clarity

  public Flight(int flightNumber) {
    this.flightNumber = flightNumber;
  }

  // other members elided for clarity
}

void swap(Flight i, Flight j) {

}

Flight val1 = new Flight(10); // so here you're allocating out memory for our variable, but then you are allocating out the class instance itself separately and assign a reference into the variable
Flight val2 = new Flight(10); // again this allocates out a place to hold the reference, the actual Flight object itself, and the associates that reference
// NOTE val1 and val2 are NOT the flights themselves, they're references to the flights
