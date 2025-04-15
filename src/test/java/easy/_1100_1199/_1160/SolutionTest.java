package easy._1100_1199._1160;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(6, solution.countCharacters(new String[] { "cat", "bt", "hat", "tree" }, "atach"));

        assertEquals(10, solution.countCharacters(new String[] { "hello", "world", "leetcode" }, "welldonehoneyr"));
    }
}
