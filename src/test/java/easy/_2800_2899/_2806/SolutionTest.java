package easy._2800_2899._2806;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(90, solution.accountBalanceAfterPurchase(9));

        assertEquals(80, solution.accountBalanceAfterPurchase(15));

        assertEquals(90, solution.accountBalanceAfterPurchase(10));
    }
}
