package easy._1200_1299._1207;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertTrue(solution.uniqueOccurrences(new int[] { 1, 2, 2, 1, 1, 3 }));

        assertFalse(solution.uniqueOccurrences(new int[] { 1, 2 }));

        assertTrue(solution.uniqueOccurrences(new int[] { -3, 0, 1, -3, 1, 1, 1, -3, 10, 0 }));
    }
}
