package easy._1500_1599._1566;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertTrue(solution.containsPattern(new int[] { 1, 2, 4, 4, 4, 4 }, 1, 3));

        assertTrue(solution.containsPattern(new int[] { 1, 2, 1, 2, 1, 1, 1, 3 }, 2, 2));

        assertFalse(solution.containsPattern(new int[] { 1, 2, 1, 2, 1, 3 }, 2, 3));
    }
}
