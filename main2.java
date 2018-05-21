public class Main {
  public static void main(String[] args) {
    int myVar;
    // System.out.println(myVAr); // this would return an error as is because local variables do not automatically get a value

    myVar = 50;
    System.out.println(myVar); // will return 50

    int anotherVar = 100;
    System.out.println(anotherVar); // will return 100

    myVar = anotherVar;
    System.out.println(myVar) // will return 100

    anotherVar = 200;
    System.out.println(anotherVar); // will return 200;

    System.out.println(myVar); // this will actually return 100, because when it was defined, anotherVar's value was 100. Meaning that variables do not change dynamically with their definitions.
  }
}
