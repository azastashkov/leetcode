package easy._3000_3099._3000;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        int[][] dimensions1 = new int[][] {
                { 9, 3 },
                { 8, 6 }
        };

        assertEquals(48, solution.areaOfMaxDiagonal(dimensions1));

        int[][] dimensions2 = new int[][] {
                { 3, 4 },
                { 4, 3 }
        };

        assertEquals(12, solution.areaOfMaxDiagonal(dimensions2));
    }
}
