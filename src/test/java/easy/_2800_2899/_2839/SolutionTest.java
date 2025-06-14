package easy._2800_2899._2839;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertTrue(solution.canBeEqual("abcd", "cdab"));

        assertFalse(solution.canBeEqual("abcd", "dacb"));
    }
}
