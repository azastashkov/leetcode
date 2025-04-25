package easy._1700_1799._1720;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertArrayEquals(new int[] { 1, 0, 2, 1 }, solution.decode(new int[] { 1, 2, 3 }, 1));

        assertArrayEquals(new int[] { 4, 2, 0, 7, 4 }, solution.decode(new int[] { 6, 2, 7, 3 }, 4));
    }
}
