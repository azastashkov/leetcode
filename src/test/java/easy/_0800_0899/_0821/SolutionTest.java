package easy._0800_0899._0821;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        int[] expected1 = new int[] { 3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0 };

        assertArrayEquals(expected1, solution.shortestToChar("loveleetcode", 'e'));

        int[] expected2 = new int[] { 3, 2, 1, 0 };

        assertArrayEquals(expected2, solution.shortestToChar("aaab", 'b'));
    }
}
