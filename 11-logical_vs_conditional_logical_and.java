package com.pluralsight.letsgetlogical;

public class Main {

  public static void main(String[] args) {
    int students = 150;
    int rooms = 0;

    if (rooms > 0 & students/rooms > 30) // so you get an error saying that you can't divide by 0
    if (rooms > 0 && students/rooms > 30) // success
      System.out.println("Crowded!!");

    System.out.println();
    System.out.println("** end progress ** ");
  }
}
