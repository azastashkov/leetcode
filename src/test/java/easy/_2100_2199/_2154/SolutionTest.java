package easy._2100_2199._2154;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(24, solution.findFinalValue(new int[] { 5, 3, 6, 1, 12 }, 3));

        assertEquals(4, solution.findFinalValue(new int[] { 2, 7, 9 }, 4));
    }
}
