package easy._2300_2399._2373;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        int[][] grid1 = new int[][] {
                { 9, 9, 8, 1 },
                { 5, 6, 2, 6 },
                { 8, 2, 6, 4 },
                { 6, 2, 2, 2 }
        };

        assertArrayEquals(new int[][] { { 9, 9 }, { 8, 6 } }, solution.largestLocal(grid1));

        int[][] grid2 = new int[][] {
                { 1, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 1 },
                { 1, 1, 2, 1, 1 },
                { 1, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 1 }
        };

        assertArrayEquals(new int[][] { { 2, 2, 2 }, { 2, 2, 2 }, { 2, 2, 2 } }, solution.largestLocal(grid2));
    }
}
