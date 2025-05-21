package easy._2200_2299._2210;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(3, solution.countHillValley(new int[] { 2, 4, 1, 1, 6, 5 }));

        assertEquals(0, solution.countHillValley(new int[] { 6, 6, 5, 5, 4, 1 }));
    }
}
