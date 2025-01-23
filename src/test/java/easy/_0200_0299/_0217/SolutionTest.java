package easy._0200_0299._0217;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertTrue(solution.containsDuplicate(new int[] { 1, 2, 3, 1 }));

        assertFalse(solution.containsDuplicate(new int[] { 1, 2, 3, 4 }));

        assertTrue(solution.containsDuplicate(new int[] { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 }));
    }
}
