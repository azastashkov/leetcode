package easy._1600_1699._1637;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        int[][] points1 = new int[][] {
                { 8, 7 },
                { 9, 9 },
                { 7, 4 },
                { 9, 7 }
        };

        assertEquals(1, solution.maxWidthOfVerticalArea(points1));

        int[][] points2 = new int[][] {
                { 3, 1 },
                { 9, 0 },
                { 1, 0 },
                { 1, 4 },
                { 5, 3 },
                { 8, 8 }
        };

        assertEquals(3, solution.maxWidthOfVerticalArea(points2));
    }
}
