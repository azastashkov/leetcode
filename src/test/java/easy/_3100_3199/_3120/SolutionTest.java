package easy._3100_3199._3120;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(3, solution.numberOfSpecialChars("aaAbcBC"));

        assertEquals(0, solution.numberOfSpecialChars("abc"));

        assertEquals(1, solution.numberOfSpecialChars("abBCab"));
    }
}
