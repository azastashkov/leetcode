package easy._2300_2399._2383;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(8, solution.minNumberOfHours(5, 3, new int[] { 1, 4, 3, 2 }, new int[] { 2, 6, 3, 1 }));

        assertEquals(0, solution.minNumberOfHours(2, 4, new int[] { 1 }, new int[] { 3 }));
    }
}
