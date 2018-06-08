String name = "Jim";
System.out.println("Hi " + name); // returns Hi Jim

String greeting = "Hello";
greeting += " "; // so what happens here is that an entirely new string object is being created with a space at the end of it, and greeting is now referening the new string object instance of "Hello " instead of the string object instance "Hello"

greeting += "World"; // greeting is now pointing to a brand new string object instance of "Hello World"
