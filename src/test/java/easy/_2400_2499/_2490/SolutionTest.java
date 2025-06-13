package easy._2400_2499._2490;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertTrue(solution.isCircularSentence("leetcode exercises sound delightful"));

        assertTrue(solution.isCircularSentence("eetcode"));

        assertFalse(solution.isCircularSentence("Leetcode is cool"));

        assertFalse(solution.isCircularSentence("ab a"));
    }
}
