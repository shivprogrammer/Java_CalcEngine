String s1 = "I Love";
s1 += " Java";

String s2 = "I";
s2 += " Love Java";

if (s1 == s2) // returns FALSE, becasue remember that the == operator compares values based on whether they point to the exact same object instance
  // do something

if (s1.equals(s2)) // this actually does a character by character comparison, so this returns TRUE
  // do something

// Something to consider though is that reference based comparisons are actually quite inexpensive, whereas character by character comparisons can be very expensive, particularly in very long strings
