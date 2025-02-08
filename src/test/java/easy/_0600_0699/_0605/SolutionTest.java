package easy._0600_0699._0605;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertTrue(solution.canPlaceFlowers(new int[] { 1, 0, 0, 0, 1 }, 1));

        assertFalse(solution.canPlaceFlowers(new int[] { 1, 0, 0, 0, 1 }, 2));

        assertTrue(solution.canPlaceFlowers(new int[] { 1, 0, 0, 0, 0, 0, 1 }, 2));

        assertTrue(solution.canPlaceFlowers(new int[] { 0, 0, 1, 0, 0 }, 1));
    }
}
