package easy._0600_0699._0628;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(6, solution.maximumProduct(new int[] { 1, 2, 3 }));

        assertEquals(24, solution.maximumProduct(new int[] { 1, 2, 3, 4 }));

        assertEquals(-6, solution.maximumProduct(new int[] { -1, -2, -3 }));
    }
}
