package integers;

public class MyPow {
  public double myPow(double x, int n) {
    long pow = n;
    double result = 1.0;
    if (n < 0) {
      pow = -1 * pow;
    }
    System.out.println(pow);

    while (pow > 0) {
      if (pow % 2 == 0) {
        x = x * x;
        pow /= 2;
      } else {
        result *= x;
        pow--;
      }
    }
    if (n > 0)
      return result;
    else
      return 1. / result;
  }
}
