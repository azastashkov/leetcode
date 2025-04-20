package easy._1300_1399._1337;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        int[][] matrix1 = new int[][] {
                { 1, 1, 0, 0, 0 },
                { 1, 1, 1, 1, 0 },
                { 1, 0, 0, 0, 0 },
                { 1, 1, 0, 0, 0 },
                { 1, 1, 1, 1, 1 }
        };

        assertArrayEquals(new int[] { 2, 0, 3 }, solution.kWeakestRows(matrix1, 3));
        
        int[][] matrix2 = {
                { 1, 0, 0, 0 },
                { 1, 1, 1, 1 },
                { 1, 0, 0, 0 },
                { 1 ,0 ,0 ,0 }
        };

        assertArrayEquals(new int[] { 0, 2 }, solution.kWeakestRows(matrix2, 2));
    }
}
