package easy._1300_1399._1317;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertArrayEquals(new int[] { 1, 1 }, solution.getNoZeroIntegers(2));

        assertArrayEquals(new int[] { 2, 9 }, solution.getNoZeroIntegers(11));
    }
}
