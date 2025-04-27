package easy._1700_1799._1725;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        int[][] rectangles1 = new int[][] {
                { 5, 8 },
                { 3, 9 },
                { 5, 12 },
                { 16, 5 }
        };

        assertEquals(3, solution.countGoodRectangles(rectangles1));

        int[][] rectangles2 = new int[][] {
                { 2, 3 },
                { 3, 7 },
                { 4, 3 },
                { 3, 7 }
        };

        assertEquals(3, solution.countGoodRectangles(rectangles2));
    }
}
