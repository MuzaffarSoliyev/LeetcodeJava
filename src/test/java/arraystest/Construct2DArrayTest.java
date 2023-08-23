package arraystest;

import arrays.Construct2DArray;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Construct2DArrayTest {
  private Construct2DArray construct2DArray;

  @Before
  public void createSolverObject() {
    construct2DArray = new Construct2DArray();
  }

  @Test
  public void shouldBeReturn1X3Array() {
    Assert.assertArrayEquals(new int[][]{{1, 2, 3}}, construct2DArray.construct2DArray(new int[]{1, 2, 3}, 1, 3));
  }

  @Test
  public void shouldBeReturn2X2Array() {
    Assert.assertArrayEquals(new int[][]{{1, 2}, {3, 4}}, construct2DArray.construct2DArray(new int[]{1, 2, 3, 4}, 2, 2));
  }

  @Test
  public void shouldBeReturnEmptyArray() {
    Assert.assertArrayEquals(new int[][]{}, construct2DArray.construct2DArray(new int[]{1, 2}, 1, 1));
  }
  @Test
  public void shouldBeReturn4X1Array() {
    Assert.assertArrayEquals(new int[][]{{1}, {1}, {1}, {1}}, construct2DArray.construct2DArray(new int[]{1,1,1,1}, 4, 1));
  }
}
