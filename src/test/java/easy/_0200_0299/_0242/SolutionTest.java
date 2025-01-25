package easy._0200_0299._0242;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertTrue(solution.isAnagram("anagram", "nagaram"));

        assertFalse(solution.isAnagram("rat", "car"));
    }
}
