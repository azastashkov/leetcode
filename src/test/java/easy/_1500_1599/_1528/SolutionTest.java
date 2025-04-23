package easy._1500_1599._1528;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals("leetcode", solution.restoreString("codeleet", new int[] { 4, 5, 6, 7, 0, 2, 1, 3 }));

        assertEquals("abc", solution.restoreString("abc", new int[] { 0, 1, 2 }));
    }
}
