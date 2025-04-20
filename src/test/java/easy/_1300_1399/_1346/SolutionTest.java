package easy._1300_1399._1346;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertTrue(solution.checkIfExist(new int[] { 10, 2, 5, 3 }));

        assertFalse(solution.checkIfExist(new int[] { 3, 1, 7, 11 }));
    }
}
