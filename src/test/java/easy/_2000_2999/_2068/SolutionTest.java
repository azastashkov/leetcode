package easy._2000_2999._2068;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertFalse(solution.checkAlmostEquivalent("aaaa", "bccb"));

        assertTrue(solution.checkAlmostEquivalent("abcdeef", "abaaacc"));

        assertTrue(solution.checkAlmostEquivalent("cccddabba", "babababab"));
    }
}
