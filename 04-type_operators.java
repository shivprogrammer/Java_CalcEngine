package com.pluralsight.typeconversion;

public class Main {

  public static void main (String[] args) {
    float floatVal = 1.0f;
    double doubleVal = -4.0d;
    byte byteVal = 7;
    short shortVal = 7;
    long longVal = 5;

    short result1 = byteVal; // success
    short result1 = longVal; // error due to type conversion clash
    short result1 = (short) longVal; // success
    short result1 = (short) byteVal; // success, but is unnecessary

    short result2 = byteVal - longVal; // this will not work because you cannot convert a long to a short
    short result2 = (short) (byteVal - longVal); // this works

    long result3 = longVal - floatVal; // error, incompatible types: possible lost conversion from float to long
    float result3 = longVal - floatVal; // success

    System.out.println("Success");
  }
}
