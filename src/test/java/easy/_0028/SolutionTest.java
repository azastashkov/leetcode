package easy._0028;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(0, solution.strStr("sadbutsad", "sad"));

        assertEquals(-1, solution.strStr("leetcode", "leeto"));

        assertEquals(-1, solution.strStr("aaaaa", "bba"));

        assertEquals(0, solution.strStr("a", "a"));

        assertEquals(4, solution.strStr("mississippi", "issip"));
    }
}
