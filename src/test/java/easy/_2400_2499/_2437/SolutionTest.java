package easy._2400_2499._2437;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(2, solution.countTime("?5:00"));

        assertEquals(100, solution.countTime("0?:0?"));

        assertEquals(1440, solution.countTime("??:??"));
    }
}
