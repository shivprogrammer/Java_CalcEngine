int kVal = 5;
int factorial = 1;

while (kVal > 1) {
  factorial *= kVal;
  kVal -= 1;
}
System.out.println(factorial); // returns 120

// Above code rewritten more cleanly below
while (kVal > 1)
  factorial *= kVal--;
