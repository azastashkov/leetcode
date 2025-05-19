package easy._2100_2199._2185;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(2, solution.prefixCount(new String[] { "pay", "attention", "practice", "attend" }, "at"));

        assertEquals(0, solution.prefixCount(new String[] { "leetcode", "win", "loops", "success" }, "code"));
    }
}
