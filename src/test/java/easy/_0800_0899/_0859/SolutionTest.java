package easy._0800_0899._0859;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertTrue(solution.buddyStrings("ab", "ba"));

        assertFalse(solution.buddyStrings("ab", "ab"));

        assertTrue(solution.buddyStrings("aa", "aa"));
    }
}
