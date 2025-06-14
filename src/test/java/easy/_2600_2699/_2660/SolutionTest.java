package easy._2600_2699._2660;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(1, solution.isWinner(new int[] { 5, 10, 3, 2 }, new int[] { 6, 5, 7, 3 }));

        assertEquals(2, solution.isWinner(new int[] { 3, 5, 7, 6 }, new int[] { 8, 10, 10, 2 }));

        assertEquals(0, solution.isWinner(new int[] { 2, 3 }, new int[] { 4, 1 }));

        assertEquals(2, solution.isWinner(new int[] { 1, 1, 1, 10, 10, 10, 10 }, new int[] { 10, 10, 10, 10, 1, 1, 1 }));
    }
}
