package easy._0700_0799._0724;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

         assertEquals(3, solution.pivotIndex(new int[] { 1, 7, 3, 6, 5, 6 }));

         assertEquals(-1, solution.pivotIndex(new int[] { 1, 2, 3 }));

        assertEquals(0, solution.pivotIndex(new int[] { 2, 1, -1 }));
    }
}
