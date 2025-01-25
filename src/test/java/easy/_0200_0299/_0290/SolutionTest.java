package easy._0200_0299._0290;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertTrue(solution.wordPattern("abba", "dog cat cat dog"));

        assertFalse(solution.wordPattern("abba", "dog cat cat fish"));

        assertFalse(solution.wordPattern("aaaa", "dog cat cat dog"));
    }
}
