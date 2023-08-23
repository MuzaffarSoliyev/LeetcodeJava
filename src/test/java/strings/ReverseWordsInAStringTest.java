package strings;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ReverseWordsInAStringTest {
    private ReverseWordsInAString reverseWordsInAString;

    @Before
    public void createSolverObject(){
        reverseWordsInAString = new ReverseWordsInAString();
    }

    @Test
    public void Test1(){
        Assert.assertEquals("blue is sky the", reverseWordsInAString.reverseWords("the sky is blue"));
    }

    @Test
    public void Test2(){
        Assert.assertEquals("world hello", reverseWordsInAString.reverseWords("  hello world  "));
    }

    @Test
    public void Test3(){
        Assert.assertEquals("example good a", reverseWordsInAString.reverseWords("a good   example"));
    }
}
