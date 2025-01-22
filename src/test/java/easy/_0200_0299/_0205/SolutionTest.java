package easy._0200_0299._0205;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertTrue(solution.isIsomorphic("egg", "add"));

        assertFalse(solution.isIsomorphic("foo", "bar"));

        assertTrue(solution.isIsomorphic("paper", "title"));
    }
}
