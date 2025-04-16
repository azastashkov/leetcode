package easy._1100_1199._1185;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals("Saturday", solution.dayOfTheWeek(31, 8, 2019));

        assertEquals("Sunday", solution.dayOfTheWeek(18, 7, 1999));

        assertEquals("Sunday", solution.dayOfTheWeek(15, 8, 1993));
    }
}
