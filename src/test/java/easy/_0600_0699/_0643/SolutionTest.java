package easy._0600_0699._0643;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(12.75, solution.findMaxAverage(new int[] { 1, 12, -5, -6, 50, 3 }, 4), 0.01);

        assertEquals(5d, solution.findMaxAverage(new int[] { 5 }, 1), 0.01);
    }
}
