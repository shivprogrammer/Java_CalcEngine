int v1 = 10, v2 = 4, diff;
if (v1 > v2)
  diff = v1 - v2;
  System.out.println("v1 is bigger");
  System.out.println(diff); // so even though diff is only defined if v1 is greater than v2, both of these print statements will print every time because only the assignment of diff is tied to the conditional
