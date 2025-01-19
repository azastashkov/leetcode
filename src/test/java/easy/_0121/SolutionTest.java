package easy._0121;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        int[] prices1 = new int[] { 7, 1, 5, 3, 6, 4 };
        assertEquals(5, solution.maxProfit(prices1));

        int[] prices2 = new int[] { 7, 6, 4, 3, 1 };
        assertEquals(0, solution.maxProfit(prices2));
    }
}
