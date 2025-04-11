package easy._0900_0999._0941;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertFalse(solution.validMountainArray(new int[] { 2, 1 }));

        assertFalse(solution.validMountainArray(new int[] { 3, 5, 5 }));

        assertTrue(solution.validMountainArray(new int[] { 0, 3, 2, 1 }));

        assertTrue(solution.validMountainArray(new int[] { 1, 3, 2 }));

        assertFalse(solution.validMountainArray(new int[] { 6, 7, 7, 8, 6 }));
    }
}
