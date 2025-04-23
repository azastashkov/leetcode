package easy._1500_1599._1550;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertFalse(solution.threeConsecutiveOdds(new int[] { 2, 6, 4, 1 }));

        assertTrue(solution.threeConsecutiveOdds(new int[] { 1, 2, 34, 3, 4, 5, 7, 23, 12 }));
    }
}
