package easy._2100_2199._2133;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        int[][] matrix1 = {
                { 1, 2, 3 },
                { 3, 1, 2 },
                { 2, 3, 1 }
        };

        assertTrue(solution.checkValid(matrix1));

        int[][] matrix2 = {
                { 1, 1, 1 },
                { 1, 2, 3 },
                { 1, 2, 3 }
        };

        assertFalse(solution.checkValid(matrix2));

        int[][] matrix3 = {
                { 1, 2 },
                { 2, 2 }
        };

        assertFalse(solution.checkValid(matrix3));

        int[][] matrix4 = {
                { 2, 2, 2 },
                { 2, 2, 2 },
                { 2, 2, 2 }
        };

        assertFalse(solution.checkValid(matrix4));
    }
}
