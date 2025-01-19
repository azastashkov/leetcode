package easy._0001_0099._0020;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertTrue(solution.isValid("()"));

        assertTrue(solution.isValid("()[]{}"));

        assertFalse(solution.isValid("(]"));

        assertTrue(solution.isValid("([])"));
    }
}
