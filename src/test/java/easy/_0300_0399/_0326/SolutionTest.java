package easy._0300_0399._0326;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertTrue(solution.isPowerOfThree(27));

        assertFalse(solution.isPowerOfThree(0));

        assertFalse(solution.isPowerOfThree(-1));
    }
}
