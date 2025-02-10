package easy._0600_0699._0682;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(30, solution.calPoints(new String[] { "5", "2", "C", "D", "+" }));

        assertEquals(27, solution.calPoints(new String[] { "5", "-2", "4", "C", "D", "9", "+", "+" }));

        assertEquals(0, solution.calPoints(new String[] { "1", "C" }));
    }
}
