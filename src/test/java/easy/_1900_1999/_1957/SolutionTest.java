package easy._1900_1999._1957;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals("leetcode", solution.makeFancyString("leeetcode"));

        assertEquals("aabaa", solution.makeFancyString("aaabaaaa"));

        assertEquals("aab", solution.makeFancyString("aab"));
    }
}
