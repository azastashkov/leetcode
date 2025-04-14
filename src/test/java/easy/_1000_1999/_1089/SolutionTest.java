package easy._1000_1999._1089;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        int[] arr1 = new int[] { 1, 0, 2, 3, 0, 4, 5, 0 };
        solution.duplicateZeros(arr1);

        assertArrayEquals(new int[] { 1, 0, 0, 2, 3, 0, 0, 4 }, arr1);

        int[] arr2 = new int[] { 1, 2, 3 };
        solution.duplicateZeros(arr2);

        assertArrayEquals(new int[] { 1, 2, 3 }, arr2);
    }
}
