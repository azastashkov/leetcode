package easy._1600_1699._1640;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        int[] arr1 = new int[] { 15, 88 };

        int[][] pieces1 = new int[][] {
                { 88 },
                { 15 }
        };

        assertTrue(solution.canFormArray(arr1, pieces1));

        int[] arr2 = new int[] { 49, 18, 16 };

        int[][] pieces2 = new int[][] {
                { 16, 18, 49 }
        };

        assertFalse(solution.canFormArray(arr2, pieces2));

        int[] arr3 = new int[] { 91, 4, 64, 78 };

        int[][] pieces3 = new int[][] {
                { 78 },
                { 4, 64 },
                { 91 }
        };

        assertTrue(solution.canFormArray(arr3, pieces3));
    }
}
