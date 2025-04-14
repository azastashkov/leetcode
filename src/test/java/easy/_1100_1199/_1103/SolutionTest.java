package easy._1100_1199._1103;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertArrayEquals(new int[] { 1, 2, 3, 1 }, solution.distributeCandies(7, 4));

        assertArrayEquals(new int[] { 5, 2, 3 }, solution.distributeCandies(10, 3));
    }
}
