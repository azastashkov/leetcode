package easy._1700_1799._1752;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertTrue(solution.check(new int[] { 3, 4, 5, 1, 2 }));

        assertFalse(solution.check(new int[] { 2, 1, 3, 4 }));

        assertTrue(solution.check(new int[] { 1, 2, 3 }));
    }
}
