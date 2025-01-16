package easy._0014;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals("fl", solution.longestCommonPrefix(new String[] { "flower", "flow", "flight" }));

        assertEquals("", solution.longestCommonPrefix(new String[] { "dog", "racecar", "car" }));
    }
}
