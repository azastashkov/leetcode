package easy._0400_0499._0459;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertTrue(solution.repeatedSubstringPattern("abab"));

        assertFalse(solution.repeatedSubstringPattern("aba"));

        assertTrue(solution.repeatedSubstringPattern("abcabcabcabc"));
    }
}
