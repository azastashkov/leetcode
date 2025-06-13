package easy._2500_2599._2515;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(1, solution.closestTarget(new String[] { "hello", "i", "am", "leetcode", "hello" }, "hello", 1));

        assertEquals(1, solution.closestTarget(new String[] { "a", "b", "leetcode" }, "leetcode", 0));

        assertEquals(-1, solution.closestTarget(new String[] { "i", "eat", "leetcode" }, "ate", 0));
    }
}
