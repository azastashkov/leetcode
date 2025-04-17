package easy._1200_1299._1252;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(6, solution.oddCells(2, 3, new int[][] { { 0, 1 }, { 1, 1 } }));

        assertEquals(0, solution.oddCells(2, 2, new int[][] { { 1, 1 }, { 0, 0 } }));
    }
}
