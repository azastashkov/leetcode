package easy._1500_1599._1518;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(13, solution.numWaterBottles(9, 3));

        assertEquals(19, solution.numWaterBottles(15, 4));
    }
}
