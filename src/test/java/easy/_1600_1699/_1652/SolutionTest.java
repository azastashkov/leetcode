package easy._1600_1699._1652;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertArrayEquals(new int[] { 12, 10, 16, 13 }, solution.decrypt(new int[] { 5, 7, 1, 4 }, 3));

        assertArrayEquals(new int[] { 0, 0, 0, 0 }, solution.decrypt(new int[] { 1, 2, 3, 4 }, 0));

        assertArrayEquals(new int[] { 12, 5, 6, 13 }, solution.decrypt(new int[] { 2, 4, 9, 3 }, -2));
    }
}
