package arraystest;

import arrays.SingleNumber;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SingleNumberTest {
  private SingleNumber singleNumber;

  @Before
  public void createSolverObject() {
    singleNumber = new SingleNumber();
  }

  @Test
  public void shouldBeReturnOne() {
    Assert.assertEquals(1, singleNumber.singleNumber(new int[]{2, 2, 1}));
  }

  @Test
  public void shouldBeReturnFour() {
    Assert.assertEquals(4, singleNumber.singleNumber(new int[]{4, 1, 2, 1, 2}));
  }

  @Test
  public void shouldBeReturnOne2() {
    Assert.assertEquals(1, singleNumber.singleNumber(new int[]{1}));
  }
}
