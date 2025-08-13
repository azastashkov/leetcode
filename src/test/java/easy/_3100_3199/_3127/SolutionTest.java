package easy._3100_3199._3127;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        char[][] grid1 = new char[][] {
                { 'B', 'W', 'B' },
                { 'B', 'W', 'W' },
                { 'B', 'W', 'B' }
        };

        assertTrue(solution.canMakeSquare(grid1));

        char[][] grid2 = new char[][] {
                { 'B', 'W', 'B' },
                { 'W', 'B', 'W' },
                { 'B', 'W', 'B' }
        };

        assertFalse(solution.canMakeSquare(grid2));

        char[][] grid3 = new char[][] {
                { 'B', 'W', 'B' },
                { 'B', 'W', 'W' },
                { 'B', 'W', 'W' }
        };

        assertTrue(solution.canMakeSquare(grid3));
    }
}
