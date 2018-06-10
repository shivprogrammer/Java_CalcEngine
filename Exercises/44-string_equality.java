String s1 = "I Love";
s1 += " Java";

String s2 = "I";
s2 += " Love Java";

if (s1 == s2) // returns FALSE, becasue remember that the == operator compares values based on whether they point to the exact same object instance
  // do something

if (s1.equals(s2)) // this actually does a character by character comparison, so this returns TRUE
  // do something

// Something to consider though is that reference based comparisons are actually quite inexpensive, whereas character by character comparisons can be very expensive, particularly in very long strings

String s3 = s1.intern(); // the intern method gives us a canonicalized reference of a string value. This is basically a fancy way of saying when you call the intern method on a string value it will always return back the exact same String Object for a given string value. So this will create a new object instance of "I Love Java", and s3 will be a reference to this new object instance
String s4 = s2.intern(); // s4 will get a reference to that exact same object instance that s3 is referencing and that the first intern call created. So the intern assures that two strings with the same value will reference the exact same object.

if (s3 == s4) // returns TRUE -- the benefit of using the intern method is that we can use that very inexpensive == operator to do the comparison
  // do something

/*
IN GENERAL:
When you're doing a series of one off comparisons of strings, you'll the equals method
But when you have situations when you expect to do a lot of comparisons to a given set of string values, that's where the intern method comes in. You'll often intern a series of string values you expect to search over and over again and put those into an array or some other collection, and then as you search that collection, you'll then intern the incoming values and use that very inexpensive == operator to see if you can find the value in that array or collection of intern string values
/*
