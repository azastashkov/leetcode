package easy._2100_2199._2119;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertTrue(solution.isSameAfterReversals(526));

        assertFalse(solution.isSameAfterReversals(1800));

        assertTrue(solution.isSameAfterReversals(0));
    }
}
