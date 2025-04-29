package easy._1800_1899._1832;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertTrue(solution.checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));

        assertFalse(solution.checkIfPangram("leetcode"));
    }
}
