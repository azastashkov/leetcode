package easy._2700_2799._2706;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(0, solution.buyChoco(new int[] { 1, 2, 2 }, 3));

        assertEquals(3, solution.buyChoco(new int[] { 3, 2, 3 }, 3));

        assertEquals(22, solution.buyChoco(new int[] { 98, 54, 6, 34, 66, 63, 52, 39 }, 62));
    }
}
