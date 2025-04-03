package easy._0700_0799._0762;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(4, solution.countPrimeSetBits(6, 10));

        assertEquals(5, solution.countPrimeSetBits(10, 15));
    }
}
