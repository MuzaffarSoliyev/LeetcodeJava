package integers;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TrailingZeroesTest {
  private TrailingZeroes trailingZeroes;

  @Before
  public void createSolverObject() {
    trailingZeroes = new TrailingZeroes();
  }

  @Test
  public void shouldBeReturnZero() {
    Assert.assertEquals(0, trailingZeroes.trailingZeroes(3));
  }

  @Test
  public void shouldBeReturnOne() {
    Assert.assertEquals(1, trailingZeroes.trailingZeroes(5));
  }

  @Test
  public void shouldBeReturnTwo() {
    Assert.assertEquals(2, trailingZeroes.trailingZeroes(10));
  }
}
