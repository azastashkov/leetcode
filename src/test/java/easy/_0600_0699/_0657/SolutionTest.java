package easy._0600_0699._0657;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertTrue(solution.judgeCircle("UD"));

        assertFalse(solution.judgeCircle("LL"));
    }
}
