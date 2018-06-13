// C:\Numbers.txt
5
12
6
4

/////////////
BufferedReader reader = null;
int total = 0;
try {
  reader = new BufferedReader(new FileReader("C:\\Numbers.txt"));
  String line = null;
  while ((line = reader.readLine()) != null)
    total += Integer.valueOf(line);
  System.out.println(total);

} catch(NumberFormatException e) { // this is an unchecked exception so the compiler doesn't require that you handle this one, but I know that this might happen in my code so I'm going to go ahead and catch it anyway
  System.out.println("Invalid value: " + e.getMessage());


} catch(IOException e) { // this would satisfy any problems interacting with the file as well as the inability to open the file
  System.out.println("Error interacting with file: " + e.getMessage());
}


} finally(Exception e) {
  try {
    if (reader != null)
      reader.close();
  } catch(Exception e) {
    System.out.println(e.getMessage());
  }
}
