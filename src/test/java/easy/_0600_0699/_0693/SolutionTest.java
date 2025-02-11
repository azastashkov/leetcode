package easy._0600_0699._0693;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertTrue(solution.hasAlternatingBits(5));

        assertFalse(solution.hasAlternatingBits(7));

        assertFalse(solution.hasAlternatingBits(11));
    }
}
