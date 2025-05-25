package easy._2200_2299._2283;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertTrue(solution.digitCount("1210"));

        assertFalse(solution.digitCount("030"));
    }
}
