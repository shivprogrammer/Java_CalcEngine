Integer i1000A = 10 * 10 * 10;
Intger i1000B = 100 * 10;

if (i1000A == i1000B) // if these were primitives, then this would work fine, BUT since these are references to classes, this returns FALSE
  // do something

if (i1000A.equals(i1000B)) // returns TRUE
  // do something

Integer i8A = 4 * 2;
Integer i8B = 2 * 2 * 2;

if (i8B == i8B) // returns TRUE, wtf
  // do something
