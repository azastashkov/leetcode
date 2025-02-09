package easy._0600_0699._0674;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(3, solution.findLengthOfLCIS(new int[] { 1, 3, 5, 4, 7 }));

        assertEquals(1, solution.findLengthOfLCIS(new int[] { 2, 2, 2, 2, 2 }));
    }
}
