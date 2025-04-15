package easy._1100_1199._1154;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(9, solution.dayOfYear("2019-01-09"));

        assertEquals(41, solution.dayOfYear("2019-02-10"));
    }
}
