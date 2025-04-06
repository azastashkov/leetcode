package easy._0700_0799._0796;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertTrue(solution.rotateString("abcde", "cdeab"));

        assertFalse(solution.rotateString("abcde", "abced"));

        assertFalse(solution.rotateString("aa", "a"));
    }
}
