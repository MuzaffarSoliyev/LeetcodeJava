package integers;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MyPowTest {
  private MyPow myPow;

  @Before
  public void createSolverObject() {
    myPow = new MyPow();
  }

  @Test
  public void shouldBeReturn1024() {
    Assert.assertEquals(1024.0, myPow.myPow(2,10), 0.000001);
  }

  @Test
  public void shouldBeReturn926100() {
    Assert.assertEquals(9.26100, myPow.myPow(2.10000,3), 0.000001);
  }

  @Test
  public void shouldBeReturn0(){
    Assert.assertEquals(0.00000, myPow.myPow(2.00000, -2147483648), 0.000001);
  }
}
