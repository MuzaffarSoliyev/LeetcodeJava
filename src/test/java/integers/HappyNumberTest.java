package integers;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HappyNumberTest {
    private HappyNumber happyNumber;

    @Before
    public void createSolverObject() {
        happyNumber = new HappyNumber();
    }

    @Test
    public void test1() {
        Assert.assertEquals(true, happyNumber.isHappy(19));
    }

    @Test
    public void test2() {
        Assert.assertEquals(false, happyNumber.isHappy(2));
    }

    @Test
    public void test3() {
        Assert.assertEquals(true, happyNumber.isHappy(7));
    }
}
