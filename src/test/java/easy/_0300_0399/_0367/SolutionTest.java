package easy._0300_0399._0367;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertTrue(solution.isPerfectSquare(16));

        assertFalse(solution.isPerfectSquare(14));

        assertTrue(solution.isPerfectSquare(808201));
    }
}
