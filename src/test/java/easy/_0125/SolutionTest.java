package easy._0125;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertTrue(solution.isPalindrome("A man, a plan, a canal: Panama"));

        assertFalse(solution.isPalindrome("race a car"));

        assertTrue(solution.isPalindrome(" "));

        assertTrue(solution.isPalindrome("a."));

        assertFalse(solution.isPalindrome("0P"));
    }
}
