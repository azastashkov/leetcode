package medium._0001_0099._0003;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(3, solution.lengthOfLongestSubstring("abcabcbb"));

        assertEquals(1, solution.lengthOfLongestSubstring("bbbbb"));

        assertEquals(3, solution.lengthOfLongestSubstring("pwwkew"));

        assertEquals(1, solution.lengthOfLongestSubstring(" "));

        assertEquals(2, solution.lengthOfLongestSubstring("au"));
    }
}