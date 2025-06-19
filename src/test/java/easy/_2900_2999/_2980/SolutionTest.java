package easy._2900_2999._2980;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertTrue(solution.hasTrailingZeros(new int[] { 1, 2, 3, 4, 5 }));

        assertTrue(solution.hasTrailingZeros(new int[] { 2, 4, 8, 16 }));

        assertFalse(solution.hasTrailingZeros(new int[] { 1, 3, 5, 7, 9 }));
    }
}
