package easy._2600_2699._2651;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(20, solution.findDelayedArrivalTime(15, 5));

        assertEquals(0, solution.findDelayedArrivalTime(13, 11));
    }
}
