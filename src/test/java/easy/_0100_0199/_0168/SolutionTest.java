package easy._0100_0199._0168;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals("A", solution.convertToTitle(1));

        assertEquals("AB", solution.convertToTitle(28));

        assertEquals("ZY", solution.convertToTitle(701));
    }
}
