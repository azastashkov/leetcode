package easy._2700_2799._2760;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(3, solution.longestAlternatingSubarray(new int[] { 3, 2, 5, 4 }, 5));

        assertEquals(1, solution.longestAlternatingSubarray(new int[] { 1, 2 }, 2));

        assertEquals(3, solution.longestAlternatingSubarray(new int[] { 2, 3, 4, 5 }, 4));
    }
}
