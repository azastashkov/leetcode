package easy._3000_3099._3065;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(3, solution.minOperations(new int[] { 2, 11, 10, 1, 3 }, 10));

        assertEquals(0, solution.minOperations(new int[] { 1, 1, 2, 4, 9 }, 1));

        assertEquals(4, solution.minOperations(new int[] { 1, 1, 2, 4, 9 }, 9));
    }
}
