package easy._2900_2999._2903;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertArrayEquals(new int[] { 0, 3 }, solution.findIndices(new int[] { 5, 1, 4, 1 }, 2, 4));

        assertArrayEquals(new int[] { 0, 1 }, solution.findIndices(new int[] { 5, 1, 4, 1 }, 0, 0));

        assertArrayEquals(new int[] { -1, -1 }, solution.findIndices(new int[] { 1, 2, 3 }, 2, 4));
    }
}
