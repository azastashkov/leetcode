package easy._2700_2799._2710;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals("512301", solution.removeTrailingZeros("51230100"));

        assertEquals("123", solution.removeTrailingZeros("123"));
    }
}
