package easy._2900_2999._2946;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        int[][] mat1 = new int[][] {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        assertFalse(solution.areSimilar(mat1, 4));

        int[][] mat2 = new int[][] {
                { 1, 2, 1, 2 },
                { 5, 5, 5, 5 },
                { 6, 3, 6, 3 }
        };

        assertTrue(solution.areSimilar(mat2, 2));

        int[][] mat3 = new int[][] {
                { 2, 2 },
                { 2, 2 }
        };

        assertTrue(solution.areSimilar(mat3, 3));
    }
}
