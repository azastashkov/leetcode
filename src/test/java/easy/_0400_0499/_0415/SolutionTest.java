package easy._0400_0499._0415;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals("134", solution.addStrings("11", "123"));

        assertEquals("533", solution.addStrings("456", "77"));

        assertEquals("0", solution.addStrings("0", "0"));
    }
}
