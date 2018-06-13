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

} catch(NumberFormatException e) {
  System.out.println("Invalid value: " + e.getMessage());
}


} finally(Exception e) {
  try {
    if (reader != null)
      reader.close();
  } catch(Exception e) {
    System.out.println(e.getMessage());
  }
}
