package easy._1700_1799._1790;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertTrue(solution.areAlmostEqual("bank", "kanb"));

        assertFalse(solution.areAlmostEqual("attack", "defend"));

        assertTrue(solution.areAlmostEqual("kelb", "kelb"));
    }
}
