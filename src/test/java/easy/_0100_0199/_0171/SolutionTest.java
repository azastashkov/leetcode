package easy._0100_0199._0171;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(1, solution.titleToNumber("A"));

        assertEquals(28, solution.titleToNumber("AB"));

        assertEquals(701, solution.titleToNumber("ZY"));
    }
}
