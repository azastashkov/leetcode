package easy._2500_2599._2506;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(2, solution.similarPairs(new String[] { "aba", "aabb", "abcd", "bac", "aabc" }));

        assertEquals(3, solution.similarPairs(new String[] { "aabb", "ab", "ba" }));

        assertEquals(0, solution.similarPairs(new String[] { "nba", "cba", "dba" }));
    }
}
