public class Flight {
  int flightNumber;
  // accessor & mutator elided for clarity

  public Flight(int flightNumber) {
    this.flightNumber = flightNumber;
  }

  // other members elided for clarity
}

void swap(Flight i, Flight j) {
  Flight k = i; // another copy of the reference to the first Flight object
  i = j; // so now i stops pointing to the first object and points to the same one that j points to (the second Flight object)
  j = k; // j stops pointing to the Flight object with 20, and now points to the first Flight object (the one with 10)
  
  // print i & j flight #
}

Flight val1 = new Flight(10); // so here you're allocating out memory for our variable, but then you are allocating out the class instance itself separately and assign a reference into the variable
Flight val2 = new Flight(10); // again this allocates out a place to hold the reference, the actual Flight object itself, and the associates that reference
// NOTE val1 and val2 are NOT the flights themselves, they're references to the flights

swap(val1, val2); // you have that memory called i that's allocated, we're going to copy what's in val1 -- which means you're copying the REFERENCE to the object, so you're going to point to that same object. For val2, you're copying the reference to the object into the memory allocated for j
