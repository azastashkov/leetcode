package easy._0400_0499._0409;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(7, solution.longestPalindrome("abccccdd"));

        assertEquals(1, solution.longestPalindrome("a"));
    }
}
