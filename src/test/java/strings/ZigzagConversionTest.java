package strings;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ZigzagConversionTest {
    private ZigzagConversion zigzagConversion;

    @Before
    public void createSolverObject() {
        zigzagConversion = new ZigzagConversion();
    }

    @Test
    public void test1() {
        Assert.assertEquals(zigzagConversion.convert("PAYPALISHIRING", 3), "PAHNAPLSIIGYIR");
    }

    @Test
    public void test2() {
        Assert.assertEquals(zigzagConversion.convert("PAYPALISHIRING", 4), "PINALSIGYAHRPI");
    }

    @Test
    public void test3() {
        Assert.assertEquals(zigzagConversion.convert("A", 2), "A");
    }
}

