package easy._1700_1799._1716;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(10, solution.totalMoney(4));

        assertEquals(37, solution.totalMoney(10));

        assertEquals(96, solution.totalMoney(20));
    }
}
