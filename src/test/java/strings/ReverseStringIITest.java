package strings;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ReverseStringIITest {
    private ReverseStringII reverseStringII;

    @Before
    public void createSolverObject() {
        reverseStringII = new ReverseStringII();
    }

    @Test
    public void test1() {
        Assert.assertEquals(reverseStringII.reverseStr("abcdefg", 2), "bacdfeg");
    }

    @Test
    public void test2() {
        Assert.assertEquals(reverseStringII.reverseStr("abcd", 2), "bacd");
    }

    @Test
    public void test3() {
        Assert.assertEquals(reverseStringII.reverseStr("abcd", 4), "dcba");
    }

    @Test
    public void test5() {
        Assert.assertEquals(reverseStringII.reverseStr("abcdefg", 3), "cbadefg");
    }
}
