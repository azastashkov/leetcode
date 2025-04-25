package easy._1600_1699._1662;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertTrue(solution.arrayStringsAreEqual(new String[] { "ab", "c" }, new String[] { "a", "bc" }));

        assertFalse(solution.arrayStringsAreEqual(new String[] { "a", "cb" }, new String[] { "ab", "c" }));

        assertTrue(solution.arrayStringsAreEqual(new String[] { "abc", "d", "defg" }, new String[] { "abcddefg" }));
    }
}
