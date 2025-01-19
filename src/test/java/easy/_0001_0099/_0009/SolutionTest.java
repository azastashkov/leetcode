package easy._0001_0099._0009;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertTrue(solution.isPalindrome(121));

        assertFalse(solution.isPalindrome(-121));

        assertFalse(solution.isPalindrome(10));
    }
}
