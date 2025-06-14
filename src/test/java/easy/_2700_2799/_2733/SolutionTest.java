package easy._2700_2799._2733;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(2, solution.findNonMinOrMax(new int[] { 3, 2, 1, 4 }));

        assertEquals(-1, solution.findNonMinOrMax(new int[] { 1, 2 }));

        assertEquals(2, solution.findNonMinOrMax(new int[] { 2, 1, 3 }));
    }
}
