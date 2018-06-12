public class OverInitializedClass {
  private int theField = 1;
  public int getTheField() { return theField; }

  {
    theField = 2;
  }

  public OverInitializedClass() {
    theField = 3;
  }
}

// with just the field initialization
OverInitializedClass c = new OverInitializedClass();
System.out.println(c.getTheField()); // returns 1

// After putting in the code for the initialization block
System.out.println(c.getTheField()); // returns 2


// After putting in the constructor
System.out.println(c.getTheField()); // returns 3
