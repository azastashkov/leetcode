package easy._2900_2999._2965;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        int[][] grid1 = new int[][] {
                { 1, 3 },
                { 2, 2 }
        };

        assertArrayEquals(new int[] { 2, 4 }, solution.findMissingAndRepeatedValues(grid1));

        int[][] grid2 = new int[][] {
                { 9, 1, 7 },
                { 8, 9, 2 },
                { 3, 4, 6 }
        };

        assertArrayEquals(new int[] { 9, 5 }, solution.findMissingAndRepeatedValues(grid2));
    }
}
