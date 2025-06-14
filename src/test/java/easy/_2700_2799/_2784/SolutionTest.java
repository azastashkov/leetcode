package easy._2700_2799._2784;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertFalse(solution.isGood(new int[] { 2, 1, 3 }));

        assertTrue(solution.isGood(new int[] { 1, 3, 3, 2 }));

        assertTrue(solution.isGood(new int[] { 1, 1 }));

        assertFalse(solution.isGood(new int[] { 3, 4, 4, 1, 2, 1 }));
    }
}
