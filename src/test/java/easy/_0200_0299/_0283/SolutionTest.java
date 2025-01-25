package easy._0200_0299._0283;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        int[] array1 = new int[] { 0, 1, 0, 3, 12 };
        solution.moveZeroes(array1);

        assertArrayEquals(new int[] {1, 3, 12, 0, 0 }, array1);

        int[] array2 = new int[] { 0 };
        solution.moveZeroes(array2);

        assertArrayEquals(new int[] { 0 }, array2);
    }
}
