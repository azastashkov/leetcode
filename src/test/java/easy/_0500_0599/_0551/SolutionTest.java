package easy._0500_0599._0551;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertTrue(solution.checkRecord("PPALLP"));

        assertFalse(solution.checkRecord("PPALLL"));

        assertTrue(solution.checkRecord("LALL"));
    }
}
