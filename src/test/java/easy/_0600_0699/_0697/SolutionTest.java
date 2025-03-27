package easy._0600_0699._0697;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(2, solution.findShortestSubArray(new int[] { 1, 2, 2, 3, 1 }));

        assertEquals(6, solution.findShortestSubArray(new int[] { 1, 2, 2, 3, 1, 4, 2 }));
    }
}
