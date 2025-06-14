package easy._2800_2899._2815;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(-1, solution.maxSum(new int[] { 112, 131, 411 }));

        assertEquals(5902, solution.maxSum(new int[] { 2536, 1613, 3366, 162 }));

        assertEquals(88, solution.maxSum(new int[] { 51, 71, 17, 24, 42 }));
    }
}
