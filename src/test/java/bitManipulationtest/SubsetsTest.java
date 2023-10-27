package bitManipulationtest;

import bitManipulation.Subsets;
import org.junit.Before;
import org.junit.Test;

public class SubsetsTest {
  private Subsets subsets;

  @Before
  public void createSolverObject() {
    subsets = new Subsets();
  }

  @Test
  public void test1() {
    System.out.println(subsets.subsets(new int[]{
      1, 2, 3
    }));
  }

}
