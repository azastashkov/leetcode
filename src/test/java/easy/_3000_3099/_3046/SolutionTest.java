package easy._3000_3099._3046;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertTrue(solution.isPossibleToSplit(new int[] { 1, 1, 2, 2, 3, 4 }));

        assertFalse(solution.isPossibleToSplit(new int[] { 1, 1, 1, 1 }));

        assertFalse(solution.isPossibleToSplit(new int[] { 6, 1, 3, 1, 1, 8, 9, 2 }));

        assertTrue(solution.isPossibleToSplit(new int[] { 8, 9, 8, 5, 9, 3, 3, 1, 2, 1 }));
    }
}
