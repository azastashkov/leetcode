package easy._1500_1599._1582;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        int[][] matrix1 = new int[][] {
                { 1, 0, 0 },
                { 0, 0, 1 },
                { 1, 0, 0 }
        };

        assertEquals(1, solution.numSpecial(matrix1));

        int[][] matrix2 = new int[][] {
                { 1, 0, 0 },
                { 0, 1, 0 },
                { 0, 0, 1 }
        };

        assertEquals(3, solution.numSpecial(matrix2));
    }
}
