package easy._0900_0999._0914;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertFalse(solution.hasGroupsSizeX(new int[] { 0, 0, 0, 0, 0, 1, 1, 2, 3, 4 }));

        assertTrue(solution.hasGroupsSizeX(new int[] { 1, 1, 2, 2, 2, 2 }));
    }
}
