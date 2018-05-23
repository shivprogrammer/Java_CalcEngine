package com.pluralsight.mathorder;

public class Main {

  public static void main(String[] args) {
    int valA = 21;
    int valB = 6;
    int valC = 3;
    int valD = 1;

    int result1 = valA - valB / valC;

    int result2 = (valA - B) / valC;

    System.out.println(result1); // returns 19
    System.out.println(result2); // returns 5

    int result3 = valA / valC * valD + valB;

    int result4 = valA / (valC * (valD + valB));

    System.out.println(result3); // returns 13
    System.out.println(result4); // returns 1

    
  }
}
