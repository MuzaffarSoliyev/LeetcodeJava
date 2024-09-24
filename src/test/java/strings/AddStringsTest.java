package strings;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AddStringsTest {
    private AddStrings addStrings;

    @Before
    public void createSolverObject() {
        addStrings = new AddStrings();
    }

    @Test
    public void test1() {
        Assert.assertEquals("134", addStrings.addStrings("11", "123"));
    }

    @Test
    public void test2() {
        Assert.assertEquals("533", addStrings.addStrings("456", "77"));
    }

    @Test
    public void test3() {
        Assert.assertEquals("0", addStrings.addStrings("0", "0"));
    }

    @Test
    public void test4() {
        Assert.assertEquals("10", addStrings.addStrings("9", "1"));
    }
}
