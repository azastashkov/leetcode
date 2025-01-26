package easy._0300_0399._0383;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertFalse(solution.canConstruct("a", "b"));

        assertFalse(solution.canConstruct("aa", "ab"));

        assertTrue(solution.canConstruct("aa", "aab"));
    }
}
