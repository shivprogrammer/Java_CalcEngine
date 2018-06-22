package com.pluralsight.calcengine;

public class DynamicHelper {
  private MathProcessing[] handlers;

  public DynamicHelper(MathProcesing[] handlers) {
    this.handlers = handlers;
  }

  public String process(String statement) {
    // IN: add 1.0 2.0
    // OUT: 1.0 + 2.0 = 3.0
  }
}
