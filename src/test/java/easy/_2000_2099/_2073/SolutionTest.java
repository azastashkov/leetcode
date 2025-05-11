package easy._2000_2099._2073;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(6, solution.timeRequiredToBuy(new int[] { 2, 3, 2 }, 2));

        assertEquals(8, solution.timeRequiredToBuy(new int[] { 5, 1, 1, 1 }, 0));
    }
}
