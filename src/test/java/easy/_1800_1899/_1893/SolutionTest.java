package easy._1800_1899._1893;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        int[][] ranges1 = new int[][] {
                { 1, 2 },
                { 3, 4 },
                { 5, 6 }
        };

        assertTrue(solution.isCovered(ranges1, 2, 5));

        int[][] ranges2 = new int[][] {
                { 1, 10 },
                { 10, 20 }
        };

        assertFalse(solution.isCovered(ranges2, 21, 21));
    }
}
