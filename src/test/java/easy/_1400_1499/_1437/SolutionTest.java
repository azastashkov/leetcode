package easy._1400_1499._1437;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertTrue(solution.kLengthApart(new int[] { 1, 0, 0, 0, 1, 0, 0, 1 }, 2));

        assertFalse(solution.kLengthApart(new int[] { 1, 0, 0, 1, 0, 1 }, 2));

        assertFalse(solution.kLengthApart(new int[] { 1, 0, 1 }, 2));
    }
}
