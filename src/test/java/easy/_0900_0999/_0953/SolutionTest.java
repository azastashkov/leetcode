package easy._0900_0999._0953;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertTrue(solution.isAlienSorted(new String[] { "hello","leetcode" }, "hlabcdefgijkmnopqrstuvwxyz"));

        assertFalse(solution.isAlienSorted(new String[] { "word", "world", "row" }, "worldabcefghijkmnpqstuvxyz"));

        assertFalse(solution.isAlienSorted(new String[] { "apple", "app" }, "abcdefghijklmnopqrstuvwxyz"));
    }
}
