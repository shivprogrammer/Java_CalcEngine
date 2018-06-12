package com.pluralsight.calcengine;

public class CalculateHelper {
  MathCommand command;
  double leftValue;
  double rightValue;
  double result;

  public void process(String statement) {
    // add 1.0 2.0
    String[] parts = statement.split(" ");
    String commandString = parts[0]; // add
    leftValue = Double.parseDouble(parts[1]) // 1.0
    rightValue = Double.parseDouble(parts[2]) // 2.0
  }

  private void setCom
}
