package easy._2700_2799._2729;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertTrue(solution.isFascinating(192));

        assertFalse(solution.isFascinating(100));

        assertFalse(solution.isFascinating(267));
    }
}
