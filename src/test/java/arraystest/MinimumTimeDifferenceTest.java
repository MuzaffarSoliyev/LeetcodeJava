package arraystest;

import arrays.MinimumTimeDifference;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class MinimumTimeDifferenceTest {
    private MinimumTimeDifference minimumTimeDifference;

    @Before
    public void createSolverObject() {
        minimumTimeDifference = new MinimumTimeDifference();
    }

    @Test
    public void shouldBeReturnOne() {
        Assert.assertEquals(1, minimumTimeDifference.findMinDifference(List.of("23:59", "00:00")));
    }

    @Test
    public void shouldBeReturnZero() {
        Assert.assertEquals(0, minimumTimeDifference.findMinDifference(List.of("00:00","23:59","00:00")));
    }

    @Test
    public void shouldBeReturnSixty() {
        Assert.assertEquals(60, minimumTimeDifference.findMinDifference(List.of("01:01","02:01")));
    }

    @Test
    public void shouldBeReturnOne2() {
        Assert.assertEquals(61, minimumTimeDifference.findMinDifference(List.of("01:01","02:02")));
    }

    @Test
    public void shouldBeReturn719() {
        Assert.assertEquals(719, minimumTimeDifference.findMinDifference(List.of("12:12","00:13")));
    }
}
