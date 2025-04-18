package easy._1300_1399._1304;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertArrayEquals(new int[] { 1, -1, 2, -2, 0 }, solution.sumZero(5));

        assertArrayEquals(new int[] { 1, -1, 0 }, solution.sumZero(3));

        assertArrayEquals(new int[] { 0 }, solution.sumZero(1));
    }
}
