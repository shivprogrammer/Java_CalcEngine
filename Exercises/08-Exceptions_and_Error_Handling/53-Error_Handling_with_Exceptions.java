// Assume that the following information is in a seperate file called Numbers.txt, and located on a Windows machine right on the C:\ drive.
5
12
6
4

////////////////
BufferedReader reader = null; // BufferedReader provides an efficient way to read content
int total = 0;

reader = new BufferedReader(new FileReader("C:\\Number.txt")); // FileReader is a built in class that takes care of the details of reading content from a file, BufferedReader is something that adds some buffering on top of that to make reading the file more efficient and also provides some helper methods
String line = null;
while ((line = reader.readLine()) != null) // notice that we're assigning line directly in the while loop
  total += Integer.valueOf(line);
System.out.println("Total: " + total);
