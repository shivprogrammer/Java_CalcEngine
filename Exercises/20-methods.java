public class MyClass {
  public void showSum (float x, float y, int count) {
    if (count < 1)
      return;
    float sum = x + y;
    for (int i = 0; i < count; i++)
      System.out.println(sum);
  }
}

MyClass m = new MyClass();
m.showSum(7.5, 1.4, 3); // will return:
/*
8.9
8.9
8.9
*/
