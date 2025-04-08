package easy._0800_0899._0883;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(17, solution.projectionArea(new int[][] { { 1, 2 }, { 3, 4 } }));

        assertEquals(5, solution.projectionArea(new int[][] { { 2 } }));

        assertEquals(8, solution.projectionArea(new int[][] { { 1, 0 }, { 0, 2 } }));
    }
}
