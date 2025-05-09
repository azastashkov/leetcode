package easy._1900_1999._1961;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        String[] words1 = new String[] { "i", "love", "leetcode", "apples" };

        assertTrue(solution.isPrefixString("iloveleetcode", words1));

        String[] words2 = new String[] { "apples", "i", "love", "leetcode" };

        assertFalse(solution.isPrefixString("iloveleetcode", words2));
    }
}
