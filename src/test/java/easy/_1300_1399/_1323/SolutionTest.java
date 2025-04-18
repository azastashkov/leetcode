package easy._1300_1399._1323;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(9969, solution.maximum69Number(9669));

        assertEquals(9999, solution.maximum69Number(9996));

        assertEquals(9999, solution.maximum69Number(9999));
    }
}
