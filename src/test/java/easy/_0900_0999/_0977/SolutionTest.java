package easy._0900_0999._0977;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertArrayEquals(new int[] { 0, 1, 9, 16, 100 }, solution.sortedSquares(new int[] { -4, -1, 0, 3, 10 }));

        assertArrayEquals(new int[] { 4, 9, 9, 49, 121 }, solution.sortedSquares(new int[] { -7, -3, 2, 3, 11 }));
    }
}