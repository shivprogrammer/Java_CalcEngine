int iVal = 1;

while (iVal < 100) {
  System.out.println(iVal);

  iVal *= 2;
}

// for loop translation of above while loop
for (int iVal = 1; iVal < 100; iVal *= 2)
  System.out.println(iVal);
