package easy._1400_1499._1496;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertFalse(solution.isPathCrossing("NES"));

        assertTrue(solution.isPathCrossing("NESWW"));
    }
}
