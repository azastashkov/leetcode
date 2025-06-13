package easy._2600_2699._2643;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        int[][] mat1 = new int[][] {
                { 0, 1 },
                { 1, 0 }
        };

        assertArrayEquals(new int[] { 0, 1 }, solution.rowAndMaximumOnes(mat1));

        int[][] mat2 = new int[][] {
                { 0, 0, 0 },
                { 0, 1, 1 }
        };

        assertArrayEquals(new int[] { 1, 2 }, solution.rowAndMaximumOnes(mat2));

        int[][] mat3 = new int[][] {
                { 0, 0 },
                { 1, 1 },
                { 0, 0 }
        };

        assertArrayEquals(new int[] { 1, 2 }, solution.rowAndMaximumOnes(mat3));
    }
}
