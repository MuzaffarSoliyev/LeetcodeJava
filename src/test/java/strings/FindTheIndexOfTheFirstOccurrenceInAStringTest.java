package strings;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FindTheIndexOfTheFirstOccurrenceInAStringTest {
  private FindTheIndexOfTheFirstOccurrenceInAString findTheIndexOfTheFirstOccurrenceInAString;

  @Before
  public void createSolverObject() {
    findTheIndexOfTheFirstOccurrenceInAString = new FindTheIndexOfTheFirstOccurrenceInAString();
  }

  @Test
  public void test1() {
    Assert.assertEquals(0, findTheIndexOfTheFirstOccurrenceInAString.strStr("sadbutsad","sad"));
  }

  @Test
  public void test2() {
    Assert.assertEquals(-1, findTheIndexOfTheFirstOccurrenceInAString.strStr("sadbutsad","leeto"));
  }
}
