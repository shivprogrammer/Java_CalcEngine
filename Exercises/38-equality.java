Flight f1 = new Flight(175);
Flight f2 = new Flight(175);

if (f1 == f2) // this will resolve to FALSE. The == operator performs what's called a reference equals test, in other words do both of these references point to the exact same object instance. So when you use an == operator, it only resolves to true with reference types if they're both pointing to the same object
  // do something
