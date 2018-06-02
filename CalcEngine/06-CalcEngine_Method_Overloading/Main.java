package com.pluralsight.calcengine;

public class Main {
  // MathEquation testEquation = new MathEquation();
  // testEquation.execute();
  // System.out.print("test=");
  // System.out.println(testEquation.getResult());

  public static void main(String[] args) {
    MathEquation[] equations = new MathEquation(4);
    equations[0] = new MathEquation('d', 100.0d, 50.0d);
    equations[1] = new MathEquation('a', 25.0d, 92.0d);
    equations[2] = new MathEquation('s', 225.0, 17.0d);
    equations[3] = new MathEquation('m', 11.0d, 3.0d);

    for(MathEquation equation : equation) {
      equation.execute();
      System.out.print("result = ");
      System.out.println(equation.getResult());
    }

    System.out.println();
    System.out.println("Using Overloads");
    System.out.println();

    double leftDouble = 9.0d;
    double rightDouble = 4.0d;
    int leftInt = 9;
    int rightInt = 4;

    MathEquation equationOverload = new MathEquation('d');

    equationOverload.execute(leftDouble, rightDouble);
    System.out.print("result=");
    System.out.println(equationOverload.getResult()); // returns 2.25

    equationOverload.execute(leftInt, rightInt);
    System.out.print("result=");
    System.out.println(equationOverload.getResult()); // also returns 2.25
    // the result with the int values is also 2.25, and this is due to a widening conversion (automatic type conversion). Since a double is "wider" than an int, or in other words a double can hold anything that is inside of an int, the system can go ahead an infer that conversion and go ahead and call the method that accepts doubles, even though we provided ints.

    // After adding execute overload method that accepts ints
    equationOverload.execute((double)leftInt, rightInt); // so the system will actually choose the method overload that accepts doubles, because that's the only that can hold all the paremeters
    System.out.print("result=");
    System.out.println(equationOverload.getResult()); // returns 2.25
  }
}
