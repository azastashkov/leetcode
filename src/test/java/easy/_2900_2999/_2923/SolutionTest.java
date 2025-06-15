package easy._2900_2999._2923;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        int[][] grid1 = new int[][] {
                { 0, 1 },
                { 0, 0 }
        };

        assertEquals(0, solution.findChampion(grid1));

        int[][] grid2 = new int[][] {
                { 0, 0, 1 },
                { 1, 0, 1 },
                { 0, 0, 0 }
        };

        assertEquals(1, solution.findChampion(grid2));
    }
}
