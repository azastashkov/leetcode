package easy._0300_0399._0342;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertTrue(solution.isPowerOfFour(16));

        assertFalse(solution.isPowerOfFour(5));

        assertTrue(solution.isPowerOfFour(1));
    }
}
