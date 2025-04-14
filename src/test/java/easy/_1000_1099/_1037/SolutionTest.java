package easy._1000_1099._1037;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertTrue(solution.isBoomerang(new int[][] { { 1, 1 }, { 2, 3 }, { 3, 2 } }));

        assertFalse(solution.isBoomerang(new int[][] { { 1, 1 }, { 2, 2 }, { 3, 3 } }));

        assertTrue(solution.isBoomerang(new int[][] { { 0, 0 }, { 1, 0 }, { 2, 2 } }));
    }
}
