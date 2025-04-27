package easy._1700_1799._1742;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(2, solution.countBalls(1, 10));

        assertEquals(2, solution.countBalls(5, 15));

        assertEquals(2, solution.countBalls(19, 28));
    }
}
