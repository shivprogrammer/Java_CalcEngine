int iVal = 100;
String sVal = String.valueOf(iVal); // sVal be the string value of "100"

int i = 2, j = 3;
int result = i * j;
System.out.println(
  i + " * " + j + " = " + result); // when you're adding an integer to a string, java knows that you want the string representation of i, j & result. So the result you'll have is the concatonated string of "2 * 3 = 6"
