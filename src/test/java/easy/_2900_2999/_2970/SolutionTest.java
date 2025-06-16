package easy._2900_2999._2970;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(10, solution.incremovableSubarrayCount(new int[] { 1, 2, 3, 4 }));

        assertEquals(7, solution.incremovableSubarrayCount(new int[] { 6, 5, 7, 8 }));

        assertEquals(3, solution.incremovableSubarrayCount(new int[] { 8, 7, 6, 6 }));
    }
}
