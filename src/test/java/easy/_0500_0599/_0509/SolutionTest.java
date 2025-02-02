package easy._0500_0599._0509;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(1, solution.fib(2));

        assertEquals(2, solution.fib(3));

        assertEquals(3, solution.fib(4));
    }
}
