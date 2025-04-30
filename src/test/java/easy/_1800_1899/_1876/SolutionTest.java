package easy._1800_1899._1876;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(1, solution.countGoodSubstrings("xyzzaz"));

        assertEquals(4, solution.countGoodSubstrings("aababcabc"));
    }
}
