package easy._0500_0599._0504;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals("202", solution.convertToBase7(100));

        assertEquals("-10", solution.convertToBase7(-7));
    }
}
