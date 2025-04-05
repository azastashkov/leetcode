package easy._0700_0799._0766;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        int[][] matrix1 = new int[][] {
                { 1, 2, 3, 4 },
                { 5, 1, 2, 3 },
                { 9, 5, 1, 2 }
        };

        assertTrue(solution.isToeplitzMatrix(matrix1));

        int[][] matrix2 = new int[][] {
                { 1, 2 },
                { 2, 2 }
        };

        assertFalse(solution.isToeplitzMatrix(matrix2));
    }
}
