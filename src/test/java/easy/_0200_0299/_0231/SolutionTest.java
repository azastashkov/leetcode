package easy._0200_0299._0231;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertTrue(solution.isPowerOfTwo(1));

        assertTrue(solution.isPowerOfTwo(16));

        assertFalse(solution.isPowerOfTwo(3));
    }
}
