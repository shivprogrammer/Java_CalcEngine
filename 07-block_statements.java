int v1 = 10, v2 = 4, diff;
if (v1 > v2) {
  diff = v1 - v2;
  System.out.println("v1 is bigger");
  System.out.println(diff); // so even though diff is only defined if v1 is greater than v2, both of these print statements will print every time because only the assignment of diff is tied to the conditional
} // -> THE BRACKETS ARE ACTUALLY A TRANSLATION INTO A BLOCK STATEMENT, WHICH IS DIFFERENT FROM THE AUTOMATIC ONES IN JAVASCRIPT
else if (v2 > v1) {
  diff = v2 - v1;
  System.out.println("v2 is bigger");
  System.out.println(diff);
}
else
  System.out.println("v1 and v2 are equal");
