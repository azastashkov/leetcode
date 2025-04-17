package easy._1200_1299._1232;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        int[][] arr1 = new int[][] {
                { 1, 2 },
                { 2, 3 },
                { 3, 4 },
                { 4, 5 },
                { 5, 6 },
                { 6, 7 }
        };

        assertTrue(solution.checkStraightLine(arr1));

        int[][] arr2 = new int[][] {
                { 1, 1 },
                { 2, 2 },
                { 3, 4 },
                { 4, 5 },
                { 5, 6 },
                { 7, 7 }
        };

        assertFalse(solution.checkStraightLine(arr2));

        int[][] arr3 = new int[][] {
                { 0, 0 },
                { 0, 1 },
                { 0, -1 }
        };

        assertTrue(solution.checkStraightLine(arr3));
    }
}
