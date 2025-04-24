package easy._1600_1699._1629;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals('c', solution.slowestKey(new int[] { 9, 29, 49, 50 }, "cbcd"));

        assertEquals('a', solution.slowestKey(new int[] { 12, 23, 36, 46, 62 }, "spuda"));
    }
}
