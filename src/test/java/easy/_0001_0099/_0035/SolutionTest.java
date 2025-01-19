package easy._0001_0099._0035;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(2, solution.searchInsert(new int[] { 1, 3, 5, 6 }, 5));

        assertEquals(1, solution.searchInsert(new int[] { 1, 3, 5, 6 }, 2));

        assertEquals(4, solution.searchInsert(new int[] { 1, 3, 5, 6 }, 7));
    }
}
