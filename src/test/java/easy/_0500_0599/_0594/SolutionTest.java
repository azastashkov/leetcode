package easy._0500_0599._0594;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(5, solution.findLHS(new int[] { 1, 3, 2, 2, 5, 2, 3, 7 }));

        assertEquals(2, solution.findLHS(new int[] { 1, 2, 3, 4 }));

        assertEquals(0, solution.findLHS(new int[] { 1, 1, 1, 1 }));
    }
}
