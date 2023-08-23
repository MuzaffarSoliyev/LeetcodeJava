package arraystest;

import arrays.FindDisappearedNumbers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class FindDisappearedNumbersTest {
  private FindDisappearedNumbers findDisappearedNumbers;

  @Before
  public void createSolverObject() {
    findDisappearedNumbers = new FindDisappearedNumbers();
  }

  @Test
  public void shouldBeReturnFiveAndSix() {
    List<Integer> list = List.of(5, 6);
    Assert.assertEquals(list, findDisappearedNumbers.findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));
  }

  @Test
  public void shouldBeReturnTwo() {
    List<Integer> list = List.of(2);
    Assert.assertEquals(list, findDisappearedNumbers.findDisappearedNumbers(new int[]{1, 1}));
  }
}
