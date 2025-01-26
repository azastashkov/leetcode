package easy._0400_0499._0405;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals("1a", solution.toHex(26));

        assertEquals("ffffffff", solution.toHex(-1));
    }
}
