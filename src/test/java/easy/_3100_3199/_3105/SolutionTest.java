package easy._3100_3199._3105;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(2, solution.longestMonotonicSubarray(new int[] { 1, 4, 3, 3, 2 }));

        assertEquals(1, solution.longestMonotonicSubarray(new int[] { 3, 3, 3, 3 }));

        assertEquals(3, solution.longestMonotonicSubarray(new int[] { 3, 2, 1 }));
    }
}
