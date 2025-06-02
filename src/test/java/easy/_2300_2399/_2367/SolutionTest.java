package easy._2300_2399._2367;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(2, solution.arithmeticTriplets(new int[] { 0, 1, 4, 6, 7, 10 }, 3));

        assertEquals(2, solution.arithmeticTriplets(new int[] { 4, 5, 6, 7, 8, 9 }, 2));
    }
}
