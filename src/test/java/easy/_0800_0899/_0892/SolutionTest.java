package easy._0800_0899._0892;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(34, solution.surfaceArea(new int[][] { { 1, 2 }, { 3, 4 } }));

        assertEquals(32, solution.surfaceArea(new int[][] { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } }));

        assertEquals(46, solution.surfaceArea(new int[][] { { 2, 2, 2 }, { 2, 1, 2 }, { 2, 2, 2 } }));
    }
}
