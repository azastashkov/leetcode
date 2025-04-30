package easy._1800_1899._1897;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertTrue(solution.makeEqual(new String[] { "abc", "aabc", "bc" }));

        assertFalse(solution.makeEqual(new String[] { "ab", "a" }));
    }
}
