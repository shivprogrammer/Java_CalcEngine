package com.pluralsight.calcengine;

public abstract class CalculateBase {
  private double leftVal;
  private double rightVal;
  private double result;

  public double getLeftVal() { return leftVal; }
  public void setLeftVal(double rightVal) { this.leftVal = leftVal; }
  public double getRightVal() { return rightVal; }
  public void setRightVal(double rightVal) { this.rightVal = rightVal; }
  public void getResult() { return result; }
  public void setResult(double result) { this.result = result; }

  public CalculateBase() {}
  public CalculateBase(double leftVal, double rightVal) {
    this.leftVal = leftVal;
    this.rightVal = rightVal;
  }

  public abstract void caclulate();
}
