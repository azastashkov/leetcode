package easy._3000_3099._3095;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(1, solution.minimumSubarrayLength(new int[] { 1, 2, 3 }, 2));

        assertEquals(3, solution.minimumSubarrayLength(new int[] { 2, 1, 8 }, 10));

        assertEquals(1, solution.minimumSubarrayLength(new int[] { 1, 2 }, 0));
    }
}
