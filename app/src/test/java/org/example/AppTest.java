package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
  @Test
  public void testSum() {
    App app = new App();
    assertEquals(5, app.sum(2, 3));
  }

  @Test
  public void testAverage() {
    App app = new App();
    assertEquals(2.5, app.average(2, 3), 0.01);
  }

  @Test
  public void testSumRange() {
    App app = new App();
    assertEquals(55, app.sumRange(1, 10));
  }

  @Test
  public void testAverageRange() {
    App app = new App();
    assertEquals(5.5, app.averageRange(1, 10), 0.01);
  }

  @Test
  public void testSumOddRange() {
    App app = new App();
    assertEquals(25, app.sumOddRange(1, 10));
  }

  @Test
  public void testSumEvenRange() {
    App app = new App();
    assertEquals(30, app.sumEvenRange(1, 10));
  }
}
