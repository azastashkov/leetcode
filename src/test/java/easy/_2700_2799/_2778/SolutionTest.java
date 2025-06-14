package easy._2700_2799._2778;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(21, solution.sumOfSquares(new int[] { 1, 2, 3, 4 }));

        assertEquals(63, solution.sumOfSquares(new int[] { 2, 7, 1, 19, 18, 3 }));
    }
}
