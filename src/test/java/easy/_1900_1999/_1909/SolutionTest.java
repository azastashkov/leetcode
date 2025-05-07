package easy._1900_1999._1909;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertTrue(solution.canBeIncreasing(new int[] { 1, 2, 10, 5, 7 }));

        assertFalse(solution.canBeIncreasing(new int[] { 2, 3, 1, 2 }));

        assertFalse(solution.canBeIncreasing(new int[] { 1, 1, 1 }));
    }
}
