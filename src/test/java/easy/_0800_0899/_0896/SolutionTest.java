package easy._0800_0899._0896;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertTrue(solution.isMonotonic(new int[] { 1, 2, 2, 3 }));

        assertTrue(solution.isMonotonic(new int[] { 6, 5, 4, 4 }));

        assertFalse(solution.isMonotonic(new int[] { 1, 3, 2 }));
    }
}
