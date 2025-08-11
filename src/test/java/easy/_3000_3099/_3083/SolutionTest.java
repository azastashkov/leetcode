package easy._3000_3099._3083;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertTrue(solution.isSubstringPresent("leetcode"));

        assertTrue(solution.isSubstringPresent("abcba"));

        assertFalse(solution.isSubstringPresent("abcd"));
    }
}
