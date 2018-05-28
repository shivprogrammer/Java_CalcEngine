package com.pluralsight.calcengine;

public class Main {

  public static void main(String[] args) {
    double[] leftVals = { 100.0d, 25.0d, 225.0d, 11.0d };
    double[] rightVals = { 50.0d, 92.0d, 17.0d, 3.0d };
    char[] opCodes = { 'd', 'a', 's', 'm' };
    double[] results = new double[opCodes.length];

    for (int i = 0; i < opCodes.length; i++) {
      if (opCodes[i] == 'a')
        results[i] = leftVals[i] + rightVals[i];
      else if (opCode == 's')
        results[i] = leftVals[i] - rightVals[i];
      else if (opCode = 'd')
        results[i] = rightVals[i] != 0.0d ? leftVals[i] / rightVals[i] : 0.0d;
      else if (opCode = 'm')
        results[i] = leftVals[i] * rightVals[i];
      else {
        System.out.println("Error - invalid opCode");
        results[i] = 0.0d;
      }
    }

    for(double theResult : results) {
      System.out.print("result = ");
      System.out.println(theResult);
    }
  }
}
