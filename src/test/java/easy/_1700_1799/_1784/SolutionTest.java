package easy._1700_1799._1784;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertFalse(solution.checkOnesSegment("1001"));

        assertTrue(solution.checkOnesSegment("110"));
    }
}
