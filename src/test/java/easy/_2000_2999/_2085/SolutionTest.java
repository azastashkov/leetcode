package easy._2000_2999._2085;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(2, solution.countWords(new String[] { "leetcode", "is", "amazing", "as", "is" },
                new String[] { "amazing", "leetcode", "is" }));

        assertEquals(0, solution.countWords(new String[] { "b", "bb", "bbb" },
                new String[] { "a", "aa", "aaa" }));

        assertEquals(1, solution.countWords(new String[] { "a", "ab" },
                new String[] { "a", "a", "a", "ab" }));
    }
}
