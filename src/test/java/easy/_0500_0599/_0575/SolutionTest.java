package easy._0500_0599._0575;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(3, solution.distributeCandies(new int[] { 1, 1, 2, 2, 3, 3 }));

        assertEquals(2, solution.distributeCandies(new int[] { 1, 1, 2, 3 }));

        assertEquals(1, solution.distributeCandies(new int[] { 6, 6, 6, 6 }));
    }
}
