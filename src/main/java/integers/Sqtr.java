package integers;

public class Sqtr {
  public int mySqrt(int x) {
    long i = 1, sqtr = i * i;
    if (x < 2) {
      return x;
    }

    while (sqtr <= x) {
      i++;
      sqtr = i * i;
    }
    return (int)i - 1;
  }
}
