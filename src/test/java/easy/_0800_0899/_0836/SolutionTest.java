package easy._0800_0899._0836;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertTrue(solution.isRectangleOverlap(new int[] { 0, 0, 2, 2 }, new int[] { 1, 1, 3, 3 }));

        assertFalse(solution.isRectangleOverlap(new int[] { 0, 0, 1, 1 }, new int[] { 1, 0, 2, 1 }));

        assertFalse(solution.isRectangleOverlap(new int[] { 0, 0, 1, 1 }, new int[] { 2, 2, 3, 3 }));
    }
}
