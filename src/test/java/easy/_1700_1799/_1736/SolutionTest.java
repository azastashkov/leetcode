package easy._1700_1799._1736;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals("23:50", solution.maximumTime("2?:?0"));

        assertEquals("09:39", solution.maximumTime("0?:3?"));

        assertEquals("19:22", solution.maximumTime("1?:22"));

        assertEquals("23:59", solution.maximumTime("??:??"));
    }
}
