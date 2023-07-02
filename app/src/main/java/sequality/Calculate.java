package sequality;

public class Calculate {
  public int sum(int x, int y) {
    return x + y;
  }

  public String twoAve(int x, int y) {
    int sum = x + y;
    double average = (double) sum / 2;
    String ret1;
    ret1 = "Sum of " + x + " and " + y + " is " + sum + ".Average is " + average + ".";
    return ret1;
  }

  public String largeMountAve(int x, int y) {
    int sum = 0, count = 0;
    double average;
    String ret1;

    for (int i = x; i <= y; i++) {
      sum += i;
      count++;
    }
    average = (double) sum / count;
    ret1 = "Sum of " + x + " to " + y + " is " + sum + ".Average is " + average + ".";
    return ret1;
  }

  public String sumEvenOdd(int x, int y) {
    int oddSum = 0, evenSum = 0;
    String ret1;

    for (int i = x; i <= y; i++) {
      if (i % 2 == 0) {
        evenSum += i;
      } else {
        oddSum += i;
      }
    }
    ret1 = "Sum of odd of " + x + " to " + y + " is " + oddSum + ".Sum of even is " + evenSum + ".";
    return ret1;
  }
}
