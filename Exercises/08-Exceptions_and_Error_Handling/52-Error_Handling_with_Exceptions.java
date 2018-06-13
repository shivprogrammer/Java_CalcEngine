int i = 12;
int j = 5;

try {
  int result = i / (j - 2);
  System.out.println(result);
} catch (Exception e) {
  System.out.println("Error: " + e.getMessage());
  e.printStackTrace();
}
