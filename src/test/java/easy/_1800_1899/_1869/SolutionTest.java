package easy._1800_1899._1869;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertTrue(solution.checkZeroOnes("1101"));

        assertFalse(solution.checkZeroOnes("111000"));

        assertFalse(solution.checkZeroOnes("110100010"));
    }
}
