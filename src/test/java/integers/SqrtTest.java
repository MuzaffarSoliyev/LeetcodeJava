package integers;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SqrtTest {
  private Sqtr sqtr;

  @Before
  public void CreateSolverObject() {
    sqtr = new Sqtr();
  }

  @Test
  public void test1() {
    Assert.assertEquals(2, sqtr.mySqrt(4));
  }

  @Test
  public void test2() {
    Assert.assertEquals(2, sqtr.mySqrt(8));
  }

  @Test
  public void test3() {
    Assert.assertEquals(3, sqtr.mySqrt(10));
  }

  @Test
  public void test4() {
    Assert.assertEquals(3, sqtr.mySqrt(9));
  }

  @Test
  public void test5() {
    Assert.assertEquals(10, sqtr.mySqrt(111));
  }
}
