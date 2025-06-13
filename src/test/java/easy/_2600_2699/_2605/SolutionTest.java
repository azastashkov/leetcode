package easy._2600_2699._2605;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(15, solution.minNumber(new int[] { 4, 1, 3 }, new int[] { 5, 7 }));

        assertEquals(3, solution.minNumber(new int[] { 3, 5, 2, 6 }, new int[] { 3, 1, 7 }));
    }
}
