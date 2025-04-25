package easy._1600_1699._1684;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(2, solution.countConsistentStrings("ab", new String[] { "ad", "bd", "aaab", "baa", "badab" }));

        assertEquals(7, solution.countConsistentStrings("abc", new String[] { "a", "b", "c", "ab", "ac", "bc", "abc" }));

        assertEquals(4, solution.countConsistentStrings("cad", new String[] { "cc", "acd", "b", "ba", "bac", "bad", "ac", "d" }));
    }
}
