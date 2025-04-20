package easy._1300_1399._1351;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        int[][] grid1 = new int[][] {
                { 4, 3, 2, -1 },
                { 3, 2, 1, -1 },
                { 1, 1, -1, -2},
                { -1, -1, -2, -3}
        };

        assertEquals(8, solution.countNegatives(grid1));
        
        int[][] grid2 = new int[][] {
                { 3, 2 },
                { 1, 0 }
        };

        assertEquals(0, solution.countNegatives(grid2));
    }
}
