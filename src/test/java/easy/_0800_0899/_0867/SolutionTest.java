package easy._0800_0899._0867;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        int[][] matrix1 = new int[][] {
                { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }
        };

        int[][] expected1 = new int[][] {
                { 1, 4, 7 }, { 2, 5, 8 }, { 3, 6, 9 }
        };

        assertArrayEquals(expected1, solution.transpose(matrix1));

        int[][] matrix2 = new int[][] {
                { 1, 2, 3 }, { 4, 5, 6 }
        };

        int[][] expected2 = new int[][] {
                { 1, 4 }, { 2, 5 }, { 3, 6 }
        };

        assertArrayEquals(expected2, solution.transpose(matrix2));
    }
}
