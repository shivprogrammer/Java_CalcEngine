package com.pluralsight.calcengine;

public class InvalidStatementException extends Exception {
  public InvalidStatementException(String reason, String statement) {
    super(reason + ": " + statement);
  }
}
