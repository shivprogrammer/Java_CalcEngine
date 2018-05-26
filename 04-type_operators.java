package com.pluralsight.typeconversion;

public class Main {

  public static void main (String[] args) {
    float floatVal = 1.0f;
    double doubleVal = -4.0d;
    byte byteVal = 7;
    short shortVal = 7;
    long longVal = 5;

    short result1 = byteVal; // this works
    short result1 = longVal; // this will not work due to type conversion clash
    short result1 = (short) longVal; // this will work

    System.out.println("Success");
  }
}
