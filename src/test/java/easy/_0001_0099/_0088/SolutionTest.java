package easy._0001_0099._0088;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        int[] nums11 = new int[] { 1, 2, 3, 0, 0, 0 };
        int[] nums12 = new int[] { 2, 5, 6 };

        solution.merge(nums11, 3, nums12, 3);

        assertArrayEquals(new int[] { 1, 2, 2, 3, 5, 6 }, nums11);

        int[] nums21 = new int[] { 1 };
        int[] nums22 = new int[] {};

        solution.merge(nums21, 1, nums22, 0);

        assertArrayEquals(new int[] { 1 }, nums21);

        int[] nums31 = new int[] { 0 };
        int[] nums32 = new int[] { 1 };

        solution.merge(nums31, 0, nums32, 1);

        assertArrayEquals(new int[] { 1 }, nums31);
    }
}
