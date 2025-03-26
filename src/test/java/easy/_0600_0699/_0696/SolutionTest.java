package easy._0600_0699._0696;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(6, solution.countBinarySubstrings("00110011"));

        assertEquals(4, solution.countBinarySubstrings("10101"));
    }
}
