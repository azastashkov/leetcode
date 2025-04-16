package easy._1100_1199._1184;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(1, solution.distanceBetweenBusStops(new int[] { 1, 2, 3, 4 }, 0, 1));

        assertEquals(3, solution.distanceBetweenBusStops(new int[] { 1, 2, 3, 4 }, 0, 2));

        assertEquals(4, solution.distanceBetweenBusStops(new int[] { 1, 2, 3, 4 }, 0, 3));
    }
}
