Integer a = 100; // Integer a means that a is a reference to an instance of the Integer wrapper class, but 100 is the primitive value 100
int b = a; // b is a primitive type, and java will take care of getting the value out that the refernece of a is pointing to
Integer c = b;

Integer d = Integer.valueOf(100); // this is the exact same thing as Integer a = 100, so we don't really need to use this ever since Java 5, but it's good to know
int e = d.intValue();
Integer f = Integer.valueOf(e);
