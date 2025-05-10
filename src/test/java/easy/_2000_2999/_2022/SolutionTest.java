package easy._2000_2999._2022;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertArrayEquals(new int[][] { { 1, 2 }, { 3, 4 } },
                solution.construct2DArray(new int[] { 1, 2, 3, 4 }, 2, 2));

        assertArrayEquals(new int[][] { { 1, 2, 3 } },
                solution.construct2DArray(new int[] { 1, 2, 3 }, 1, 3));

        assertArrayEquals(new int[0][0],
                solution.construct2DArray(new int[] { 1, 2 }, 1, 1));
    }
}
