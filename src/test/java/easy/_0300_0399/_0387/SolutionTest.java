package easy._0300_0399._0387;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(0, solution.firstUniqChar("leetcode"));

        assertEquals(2, solution.firstUniqChar("loveleetcode"));

        assertEquals(-1, solution.firstUniqChar("aabb"));

        assertEquals(-1, solution.firstUniqChar("aaaaaaaaaaaaa"));
    }
}
