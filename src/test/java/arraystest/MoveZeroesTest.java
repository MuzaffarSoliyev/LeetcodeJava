package arraystest;

import arrays.MoveZeroes;
import org.junit.Before;
import org.junit.Test;

public class MoveZeroesTest {
  private MoveZeroes moveZeroes;

  @Before
  public void createSolverObject() {
    moveZeroes = new MoveZeroes();
  }

  @Test
  public void test1() {
    moveZeroes.moveZeroes(new int[]{0,1,0,3,12});
  }

  @Test
  public void test2() {
    moveZeroes.moveZeroes(new int[]{0,0,1});
  }
}
