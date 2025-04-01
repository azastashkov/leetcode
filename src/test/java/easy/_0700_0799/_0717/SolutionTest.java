package easy._0700_0799._0717;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertTrue(solution.isOneBitCharacter(new int[] { 1, 0, 0 }));

        assertFalse(solution.isOneBitCharacter(new int[] { 1, 1, 1, 0 }));

        assertTrue(solution.isOneBitCharacter(new int[] { 0, 0 }));

        assertTrue(solution.isOneBitCharacter(new int[] { 1, 1, 0 }));
    }
}
