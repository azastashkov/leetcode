package easy._0500_0599._0566;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        int[][] matrix1 = new int[][] {
                { 1, 2 }, { 3, 4 }
        };

        assertArrayEquals(new int[][] { { 1, 2, 3, 4 } }, solution.matrixReshape(matrix1, 1, 4));

        int[][] matrix2 = new int[][] {
                { 1, 2 }, { 3, 4 }
        };

        assertArrayEquals(new int[][] { { 1, 2 }, { 3, 4 } }, solution.matrixReshape(matrix2, 2, 4));

        int[][] matrix3 = new int[][] {
                { 1, 2, 3, 4 }
        };

        assertArrayEquals(new int[][] { { 1, 2 }, { 3, 4 } }, solution.matrixReshape(matrix3, 2, 2));

        int[][] matrix4 = new int[][] {
                { 1, 2 }
        };

        assertArrayEquals(new int[][] { { 1, 2 } }, solution.matrixReshape(matrix4, 1, 1));
    }
}
