package easy._1000_1999._1005;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(5, solution.largestSumAfterKNegations(new int[] { 4, 2, 3 }, 1));

        assertEquals(6, solution.largestSumAfterKNegations(new int[] { 3, -1, 0, 2 }, 3));

        assertEquals(13, solution.largestSumAfterKNegations(new int[] { 2, -3, -1, 5, -4 }, 2));
    }
}
