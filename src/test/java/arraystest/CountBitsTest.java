package arraystest;

import arrays.CountBits;
import arrays.CountBitsWithBItsOperations;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CountBitsTest {
  private CountBitsWithBItsOperations countBits;

  @Before
  public void createSolverObject() {
    countBits = new CountBitsWithBItsOperations();
  }

  @Test
  public void shouldBeReturn1() {
    Assert.assertArrayEquals(new int[]{0, 1, 1}, countBits.countBits(2));
  }

  @Test
  public void shouldBeReturn2() {
    Assert.assertArrayEquals(new int[]{0, 1, 1, 2, 1, 2}, countBits.countBits(5));
  }
}
