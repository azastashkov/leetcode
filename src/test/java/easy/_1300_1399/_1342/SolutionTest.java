package easy._1300_1399._1342;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(6, solution.numberOfSteps(14));

        assertEquals(4, solution.numberOfSteps(8));

        assertEquals(12, solution.numberOfSteps(123));
    }
}
