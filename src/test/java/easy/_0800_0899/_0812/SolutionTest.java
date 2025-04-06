package easy._0800_0899._0812;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        int[][] points1 = new int[][] {
                { 0, 0 },
                { 0, 1 },
                { 1, 0 },
                { 0, 2 },
                { 2, 0 }
        };

        assertEquals(2.0, solution.largestTriangleArea(points1), 0.00001);

        int[][] points2 = new int[][] {
                { 0, 0 },
                { 0, 1 },
                { 1, 0 }
        };

        assertEquals(0.5, solution.largestTriangleArea(points2), 0.00001);
    }
}
