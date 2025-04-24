package easy._1600_1699._1646;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(3, solution.getMaximumGenerated(7));

        assertEquals(1, solution.getMaximumGenerated(2));

        assertEquals(2, solution.getMaximumGenerated(3));
    }
}
