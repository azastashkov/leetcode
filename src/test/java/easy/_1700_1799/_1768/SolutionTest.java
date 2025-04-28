package easy._1700_1799._1768;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals("apbqcr", solution.mergeAlternately("abc", "pqr"));

        assertEquals("apbqrs", solution.mergeAlternately("ab", "pqrs"));

        assertEquals("apbqcd", solution.mergeAlternately("abcd", "pq"));
    }
}
