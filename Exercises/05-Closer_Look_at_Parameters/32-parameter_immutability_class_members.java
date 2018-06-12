void swapNumbers(Flight i, Flight j) {
  int k = i.getFlightNumber(); // takes the reference held by i, goes up to the object instance that it points to, and gets back the number 10, and puts that inside k
  i.setFlightNumber(j.getFlightNumber()); // so this actually CHANGES THE OBJECT ITSELF that the references are pointing too, NOT JUST THE REFERENCE
  j.setFlightNumber(k);
}

Flight val1 = new Flight(10);
Flight val2 = new Flight(20);

// print val1 and val2 flight #
// val -> 10
// val2 -> 20

swapNumbers(val1, val2);
// print val1 & val2 flight #
// VAL1 -> 20
// VAL2 -> 10
