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
  }
}
