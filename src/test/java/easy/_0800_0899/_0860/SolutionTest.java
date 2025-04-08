package easy._0800_0899._0860;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertTrue(solution.lemonadeChange(new int[] { 5, 5, 5, 10, 20 }));

        assertFalse(solution.lemonadeChange(new int[] { 5, 5, 10, 10, 20 }));

        assertFalse(solution.lemonadeChange(new int[] { 5, 5, 5, 5, 20, 20, 5, 5, 20, 5 }));
    }
}
