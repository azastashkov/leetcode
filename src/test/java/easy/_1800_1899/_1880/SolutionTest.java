package easy._1800_1899._1880;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertTrue(solution.isSumEqual("acb", "cba", "cdb"));

        assertFalse(solution.isSumEqual("aaa", "a", "aab"));

        assertTrue(solution.isSumEqual("aaa", "a", "aaaa"));
    }
}
