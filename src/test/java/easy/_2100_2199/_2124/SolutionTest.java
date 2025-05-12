package easy._2100_2199._2124;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertTrue(solution.checkString("aaabbb"));

        assertFalse(solution.checkString("abab"));

        assertTrue(solution.checkString("bbb"));
    }
}
