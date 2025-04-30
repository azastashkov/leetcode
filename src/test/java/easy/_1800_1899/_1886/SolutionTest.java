package easy._1800_1899._1886;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        int[][] mat1 = new int[][] {
                { 0, 1 },
                { 1, 0 }
        };

        int[][] target1 = new int[][] {
                { 1, 0 },
                { 0, 1 }
        };

        assertTrue(solution.findRotation(mat1, target1));

        int[][] mat2 = new int[][] {
                { 0, 1 },
                { 1, 1 }
        };

        int[][] target2 = new int[][] {
                { 1, 0 },
                { 0, 1 }
        };

        assertFalse(solution.findRotation(mat2, target2));

        int[][] mat3 = new int[][] {
                { 0, 0, 0 },
                { 0, 1, 0 },
                { 1, 1, 1 }
        };

        int[][] target3 = new int[][] {
                { 1, 1, 1 },
                { 0, 1, 0 },
                { 0, 0, 0 }
        };

        assertTrue(solution.findRotation(mat3, target3));
    }
}
