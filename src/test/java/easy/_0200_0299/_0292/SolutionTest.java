package easy._0200_0299._0292;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertFalse(solution.canWinNim(4));

        assertTrue(solution.canWinNim(1));

        assertTrue(solution.canWinNim(2));
    }
}
