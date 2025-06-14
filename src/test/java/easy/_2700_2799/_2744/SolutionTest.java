package easy._2700_2799._2744;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(2, solution.maximumNumberOfStringPairs(new String[] { "cd", "ac", "dc", "ca", "zz" }));

        assertEquals(1, solution.maximumNumberOfStringPairs(new String[] { "ab", "ba", "cc" }));

        assertEquals(0, solution.maximumNumberOfStringPairs(new String[] { "aa", "ab" }));
    }
}
