package easy._2400_2499._2475;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(3, solution.unequalTriplets(new int[] { 4, 4, 2, 4, 3 }));

        assertEquals(0, solution.unequalTriplets(new int[] { 1, 1, 1, 1, 1 }));
    }
}
