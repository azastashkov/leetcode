package easy._0200_0299._0219;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertTrue(solution.containsNearbyDuplicate(new int[] { 1, 2, 3, 1 }, 3));

        assertTrue(solution.containsNearbyDuplicate(new int[] { 1, 0, 1, 1 }, 1));

        assertFalse(solution.containsNearbyDuplicate(new int[] { 1, 2, 3, 1, 2, 3 }, 2));
    }
}
