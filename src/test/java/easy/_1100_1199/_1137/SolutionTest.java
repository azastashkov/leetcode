package easy._1100_1199._1137;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(4, solution.tribonacci(4));

        assertEquals(1389537, solution.tribonacci(25));
    }
}
