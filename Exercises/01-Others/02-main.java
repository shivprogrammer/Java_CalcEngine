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

// Integer Types
byte numberOfEnglishLetters = 26;
short feetInAMile = 5283;
int milesToSun = 92960000;
long nationalDebt = 18100000000000L;

// Floating Point Types
float milesInAMarathon = 26.2f;
double atomwidthInMeters = 0.00000000001d;

// Character and Boolean Types
char regularU = 'U';
char accentedU = '\u00DA'; // will return a 'U' with an accent mark on top of it
boolean iLoveJava = true;

// Prefix/Postfix Operators
int myVal = 5;
System.out.println(++myVal); // will return 6, since the 5 was incremented first
System.out.println(myVal); // returns 6

int myVal = 5;
System.out.println(myVal++); // returns 5
System.out.pritntln(myVal); // returns 6

// Compound Assignment Operators
int myVal = 50;
myVal -= 5;
System.out.println(myVal); // returns 45

int result = 100;
int val1 = 5;
int val2 = 10;
result /= val1* val2; // 100 / 50
System.out.println(result); // returns 2
