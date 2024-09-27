package hashtabletest;

import hashtable.IsomorphicStrings;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IsomorphicStringsTest {
    private IsomorphicStrings isomorphicStrings;

    @Before
    public void createSolverObject() {
        isomorphicStrings = new IsomorphicStrings();
    }

    @Test
    public void test1() {
        Assert.assertEquals(true, isomorphicStrings.isIsomorphic("egg", "add"));
    }

    @Test
    public void test2() {
        Assert.assertEquals(false, isomorphicStrings.isIsomorphic("foo", "bar"));
    }

    @Test
    public void test3() {
        Assert.assertEquals(true, isomorphicStrings.isIsomorphic("paper", "title"));
    }

    @Test
    public void test4() {
        Assert.assertEquals(false, isomorphicStrings.isIsomorphic("bbbaaaba", "aaabbbba"));
    }

    @Test
    public void test5() {
        Assert.assertEquals(false, isomorphicStrings.isIsomorphic("badc", "baba"));
    }
}
