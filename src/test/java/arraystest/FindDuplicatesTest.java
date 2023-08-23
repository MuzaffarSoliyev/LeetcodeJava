package arraystest;

import arrays.FindDuplicates;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class FindDuplicatesTest {
  private FindDuplicates findDuplicates;

  @Before
  public void createSolverObject() {
    findDuplicates = new FindDuplicates();
  }

  @Test
  public void shouldBeReturnTwoAndThree() {
    Assert.assertEquals(List.of(2, 3), findDuplicates.findDuplicates(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));
  }

  @Test
  public void shouldBeReturnOne() {
    Assert.assertEquals(List.of(1), findDuplicates.findDuplicates(new int[]{1,1,2}));
  }

  @Test
  public void shouldBeReturnEmptyArray() {
    Assert.assertEquals(List.of(), findDuplicates.findDuplicates(new int[]{1}));
  }
}
