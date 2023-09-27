package arraystest;

import arrays.SearchInsertPosition;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SearchInsertPositionTest {
  private SearchInsertPosition searchInsertPosition;

  @Before
  public void createSolverObject() {
    searchInsertPosition = new SearchInsertPosition();
  }

  @Test
  public void test1() {
    Assert.assertEquals(2, searchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 5));
  }

  @Test
  public void test2() {
    Assert.assertEquals(4, searchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 7));
  }

  @Test
  public void test3() {
    Assert.assertEquals(1, searchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 2));
  }
}
