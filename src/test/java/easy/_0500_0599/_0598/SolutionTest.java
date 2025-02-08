package easy._0500_0599._0598;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        int[][] ops1 = new int[][] {
                { 2, 2 },
                { 3, 3 },
        };

        assertEquals(4, solution.maxCount(3, 3, ops1));

        int[][] ops2 = new int[][] {
                { 2, 2 },
                { 3, 3 },
                { 3, 3 },
                { 3, 3 },
                { 2, 2 },
                { 3, 3 },
                { 3, 3 },
                { 3, 3 },
                { 2, 2 },
                { 3, 3 },
                { 3, 3 },
                { 3, 3 }
        };

        assertEquals(4, solution.maxCount(3, 3, ops2));

        int[][] ops3 = new int[][] {
        };

        assertEquals(9, solution.maxCount(3, 3, ops3));
    }
}
