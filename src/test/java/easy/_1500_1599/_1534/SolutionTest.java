package easy._1500_1599._1534;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(4, solution.countGoodTriplets(new int[] { 3, 0, 1, 1, 9, 7 }, 7, 2, 3));

        assertEquals(0, solution.countGoodTriplets(new int[] { 1, 1, 2, 2, 3 }, 0, 0, 1));
    }
}
