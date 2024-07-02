package org.example;

public class App {
  public String getGreeting() {
    return "Hello World!";
  }

  public int sum(int a, int b) {
    return a + b;
  }

  public double average(int a, int b) {
    return sum(a, b) / 2.0;
  }

  public int sumRange(int start, int end) {
    int sum = 0;
    for (int i = start; i <= end; i++) {
      sum += i;
    }
    return sum;
  }

  public double averageRange(int start, int end) {
    return sumRange(start, end) / (double) (end - start + 1);
  }

  public int sumOddRange(int start, int end) {
    int sum = 0;
    for (int i = start; i <= end; i++) {
      if (i % 2 != 0) {
        sum += i;
      }
    }
    return sum;
  }

  public int sumEvenRange(int start, int end) {
    int sum = 0;
    for (int i = start; i <= end; i++) {
      if (i % 2 == 0) {
        sum += i;
      }
    }
    return sum;
  }

  public static void main(String[] args) {
    App app = new App();
    System.out.println(app.getGreeting());
    System.out.println("Sum of 2 and 3 is " + app.sum(2, 3) + ". Average is " + app.average(2, 3) + ".");
    System.out.println("Sum of 1 to 10 is " + app.sumRange(1, 10) + ". Average is " + app.averageRange(1, 10) + ".");
    System.out.println(
        "Sum of odd of 1 to 10 is " + app.sumOddRange(1, 10) + ". Sum of even is " + app.sumEvenRange(1, 10) + ".");
  }
}
