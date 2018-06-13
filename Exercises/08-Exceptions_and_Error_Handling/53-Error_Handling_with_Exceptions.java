// Assume that the following information is in a seperate file called Numbers.txt, and located on a Windows machine right on the C:\ drive.
5
12
6
4

////////////////
BufferedReader reader = null; // BufferedReader provides an efficient way to read content // Also, notice that we declare this before the try block, rather than declaring it inside the try block. The reason we do this is because we need to have access to the variable reader down in our finally block. If we declared reader inside our try block, we wouldn't be able to see it in the finally block
int total = 0;

try {
  reader = new BufferedReader(new FileReader("C:\\Number.txt")); // FileReader is a built in class that takes care of the details of reading content from a file, BufferedReader is something that adds some buffering on top of that to make reading the file more efficient and also provides some helper methods
  String line = null;
  while ((line = reader.readLine()) != null) // notice that we're assigning line directly in the while loop
  total += Integer.valueOf(line);
  System.out.println("Total: " + total);
} catch (Exception e) {
  System.out.println(e.getMessage());
} finally {
  reader.close();
}
