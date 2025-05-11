package easy._2000_2099._2099;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertArrayEquals(new int[] { 3, 3 }, solution.maxSubsequence(new int[] { 2, 1, 3, 3 }, 2));

        assertArrayEquals(new int[] { -1, 3, 4 }, solution.maxSubsequence(new int[] { -1, -2, 3, 4 }, 3));

        assertArrayEquals(new int[] { 4, 3 }, solution.maxSubsequence(new int[] { 3, 4, 3, 3 }, 2));
    }
}
