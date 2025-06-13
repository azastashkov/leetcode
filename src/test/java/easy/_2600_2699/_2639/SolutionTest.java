package easy._2600_2699._2639;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        int[][] grid1 = new int[][] {
                { 1 },
                { 22 },
                { 333 }
        };

        assertArrayEquals(new int[] { 3 }, solution.findColumnWidth(grid1));

        int[][] grid2 = new int[][] {
                { -15, 1, 3 },
                { 15, 7, 12 },
                { 5, 6, -2 }
        };

        assertArrayEquals(new int[] { 3, 1, 2 }, solution.findColumnWidth(grid2));
    }
}
