package easy._2400_2499._2409;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(3, solution.countDaysTogether("08-15", "08-18", "08-16", "08-19"));

        assertEquals(0, solution.countDaysTogether("10-01", "10-31", "11-01", "12-31"));
    }
}
