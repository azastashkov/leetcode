package easy._0300_0399._0338;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertArrayEquals(new int[] { 0, 1, 1 }, solution.countBits(2));

        assertArrayEquals(new int[] { 0, 1, 1, 2, 1, 2 }, solution.countBits(5));
    }
}
