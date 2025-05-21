package easy._2200_2299._2206;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertTrue(solution.divideArray(new int[] { 3, 2, 3, 2, 2, 2 }));

        assertFalse(solution.divideArray(new int[] { 1, 2, 3, 4 }));
    }
}
