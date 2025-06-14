package easy._2600_2699._2697;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals("efcfe", solution.makeSmallestPalindrome("egcfe"));

        assertEquals("abba", solution.makeSmallestPalindrome("abcd"));

        assertEquals("neven", solution.makeSmallestPalindrome("seven"));

    }
}
