package easy._0070;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(2, solution.climbStairs(2));

        assertEquals(3, solution.climbStairs(3));

        assertEquals(5, solution.climbStairs(4));
    }
}
