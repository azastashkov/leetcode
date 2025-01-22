package easy._0200_0299._0202;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertTrue(solution.isHappy(19));

        assertFalse(solution.isHappy(2));
    }
}
