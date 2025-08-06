package easy._3000_3099._3042;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(4, solution.countPrefixSuffixPairs(new String[] { "a", "aba", "ababa", "aa" }));

        assertEquals(2, solution.countPrefixSuffixPairs(new String[] { "pa", "papa", "ma", "mama" }));

        assertEquals(0, solution.countPrefixSuffixPairs(new String[] { "abab", "ab" }));
    }
}
