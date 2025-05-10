package easy._2000_2999._2037;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(4, solution.minMovesToSeat(new int[] { 3, 1, 5 }, new int[] { 2, 7, 4 }));

        assertEquals(7, solution.minMovesToSeat(new int[] { 4, 1, 5, 9 }, new int[] { 1, 3, 2, 6 }));

        assertEquals(4, solution.minMovesToSeat(new int[] { 2, 2, 6, 6 }, new int[] { 1, 3, 2, 6 }));
    }
}
