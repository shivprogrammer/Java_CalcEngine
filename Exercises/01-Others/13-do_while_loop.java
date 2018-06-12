int iVal = 5;

do {
  System.out.print(iVal); // print instead of println does not print the outcome on a new line
  System.out.print(" * 2 = ");
  iVal *= 2;
  System.out.println(iVal);
} while (iVal < 100);

/*
The results in the console will be the following:
5 * 2 = 10
10 * 2 = 20
20 * 2 = 40
40 * 2 = 80
80 * 2 = 160
*/

// if iVal was originally set at 150, it would still run through the do while loop at least once, meaning that the reuslt will produce 150 * 2 = 300
