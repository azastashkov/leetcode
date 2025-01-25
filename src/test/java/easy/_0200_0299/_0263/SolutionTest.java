package easy._0200_0299._0263;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertTrue(solution.isUgly(6));

        assertTrue(solution.isUgly(1));

        assertFalse(solution.isUgly(14));
    }
}
