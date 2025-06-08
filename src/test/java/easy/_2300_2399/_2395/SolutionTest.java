package easy._2300_2399._2395;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertTrue(solution.findSubarrays(new int[] { 4, 2, 4 }));

        assertFalse(solution.findSubarrays(new int[] { 1, 2, 3, 4, 5 }));

        assertTrue(solution.findSubarrays(new int[] { 0, 0, 0 }));
    }
}
