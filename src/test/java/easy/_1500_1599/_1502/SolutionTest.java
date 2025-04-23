package easy._1500_1599._1502;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertTrue(solution.canMakeArithmeticProgression(new int[] { 3, 5, 1 }));

        assertFalse(solution.canMakeArithmeticProgression(new int[] { 1, 2, 4 }));
    }
}
