package easy._1700_1799._1779;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        int[][] points1 = new int[][] {
                { 1, 2 },
                { 3, 1 },
                { 2, 4 },
                { 2, 3 },
                { 4, 4 }
        };

        assertEquals(2, solution.nearestValidPoint(3, 4, points1));

        int[][] points2 = new int[][] {
                { 3, 4 }
        };

        assertEquals(0, solution.nearestValidPoint(3, 4, points2));

        int[][] points3 = new int[][] {
                { 2, 3 }
        };

        assertEquals(-1, solution.nearestValidPoint(3, 4, points3));
    }
}
