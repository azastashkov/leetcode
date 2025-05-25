package easy._2300_2399._2319;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        int[][] grid1 = new int[][] {
                { 2, 0, 0, 1 },
                { 0, 3, 1, 0 },
                { 0, 5, 2, 0 },
                { 4, 0, 0, 2 }
        };

        assertTrue(solution.checkXMatrix(grid1));

        int[][] grid2 = new int[][] {
                { 5, 7, 0 },
                { 0, 3, 1 },
                { 0, 5, 0 }
        };

        assertFalse(solution.checkXMatrix(grid2));
    }
}
