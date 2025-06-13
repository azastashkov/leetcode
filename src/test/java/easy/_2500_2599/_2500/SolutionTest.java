package easy._2500_2599._2500;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        int[][] grid1 = new int[][] {
                { 1, 2, 4 },
                { 3, 3, 1 }
        };

        assertEquals(8, solution.deleteGreatestValue(grid1));

        int[][] grid2 = new int[][] {
                { 10 }
        };

        assertEquals(10, solution.deleteGreatestValue(grid2));
    }
}
