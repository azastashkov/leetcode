package easy._1400_1499._1460;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertTrue(solution.canBeEqual(new int[] { 1, 2, 3, 4 }, new int[] { 2, 4, 1, 3 }));

        assertTrue(solution.canBeEqual(new int[] { 7 }, new int[] { 7 }));

        assertFalse(solution.canBeEqual(new int[] { 3, 7, 9 }, new int[] { 3, 7, 11 }));
    }
}
