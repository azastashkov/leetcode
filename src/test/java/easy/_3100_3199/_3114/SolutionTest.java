package easy._3100_3199._3114;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals("11:54", solution.findLatestTime("1?:?4"));

        assertEquals("09:59", solution.findLatestTime("0?:5?"));
    }
}
