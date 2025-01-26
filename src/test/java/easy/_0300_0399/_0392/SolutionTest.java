package easy._0300_0399._0392;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertTrue(solution.isSubsequence("abc", "ahbgdc"));

        assertFalse(solution.isSubsequence("axc", "ahbgdc"));
    }
}
