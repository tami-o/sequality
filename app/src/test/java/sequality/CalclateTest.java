package sequality;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalclateTest {
  @Test
  public void testSum() {
    Calculate calculate = new Calculate();
    int expected = 5;
    assertEquals(expected, calculate.sum(2, 3));
  }

  @Test
  public void testTwoAve() {
    Calculate calculate = new Calculate();
    String expected = "Sum of 2 and 3 is 5.Average is 2.5.";
    assertEquals(expected, calculate.twoAve(2, 3));
  }

  @Test
  public void testLargeMountAve() {
    Calculate calculate = new Calculate();
    String expected = "Sum of 1 to 10 is 55.Average is 5.5.";
    assertEquals(expected, calculate.largeMountAve(1, 10));
  }

  @Test
  public void testSumEvenOdd() {
    Calculate calculate = new Calculate();
    String expected = "Sum of odd of 1 to 10 is 25.Sum of even is 30.";
    assertEquals(expected, calculate.sumEvenOdd(1, 10));
  }
}
