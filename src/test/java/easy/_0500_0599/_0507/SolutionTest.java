package easy._0500_0599._0507;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertTrue(solution.checkPerfectNumber(28));

        assertFalse(solution.checkPerfectNumber(7));

        assertFalse(solution.checkPerfectNumber(2016));
    }
}
