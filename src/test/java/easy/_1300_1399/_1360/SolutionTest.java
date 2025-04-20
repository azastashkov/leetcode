package easy._1300_1399._1360;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(1, solution.daysBetweenDates("2019-06-29", "2019-06-30"));

        assertEquals(15, solution.daysBetweenDates("2020-01-15", "2019-12-31"));

        assertEquals(14331, solution.daysBetweenDates("1971-06-29", "2010-09-23"));

        assertEquals(25923, solution.daysBetweenDates("2009-08-18", "2080-08-08"));
    }
}
