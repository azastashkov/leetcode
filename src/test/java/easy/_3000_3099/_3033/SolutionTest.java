package easy._3000_3099._3033;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        int[][] matrix1 = new int[][] {
                { 1, 2, -1 },
                { 4, -1, 6 },
                { 7, 8, 9 }
        };

        int[][] answer1 = new int[][] {
                { 1, 2, 9 },
                { 4, 8, 6 },
                { 7, 8, 9 }
        };

        assertArrayEquals(answer1, solution.modifiedMatrix(matrix1));

        int[][] matrix2 = new int[][] {
                { 3, -1 },
                { 5, 2 }
        };

        int[][] answer2 = new int[][] {
                { 3, 2 },
                { 5, 2 }
        };

        assertArrayEquals(answer2, solution.modifiedMatrix(matrix2));
    }
}
