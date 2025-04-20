package easy._1300_1399._1380;

import org.junit.Test;

import java.util.Collections;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        int[][] matrix1 = new int[][] {
                { 3, 7, 8 },
                { 9, 11, 13 },
                { 15, 16, 17 }
        };

        assertEquals(Collections.singletonList(15), solution.luckyNumbers(matrix1));

        int[][] matrix2 = new int[][] {
                { 1, 10, 4, 2 },
                { 9, 3, 8, 7 },
                { 15, 16, 17, 12 }
        };

        assertEquals(Collections.singletonList(12), solution.luckyNumbers(matrix2));

        int[][] matrix3 = new int[][] {
                { 7, 8 }, { 1, 2 }
        };

        assertEquals(Collections.singletonList(7), solution.luckyNumbers(matrix3));
    }
}
