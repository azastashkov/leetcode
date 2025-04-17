package easy._1200_1299._1266;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(7, solution.minTimeToVisitAllPoints(new int[][] { { 1, 1 }, { 3, 4 }, { -1, 0 } }));

        assertEquals(5, solution.minTimeToVisitAllPoints(new int[][] { { 3, 2 }, { -2, 2 } }));
    }
}
