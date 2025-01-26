package easy._0300_0399._0349;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertArrayEquals(new int[] { 2 }, solution.intersection(new int[] { 1, 2, 2, 1 }, new int[] { 2, 2 }));

        assertArrayEquals(new int[] { 4, 9 }, solution.intersection(new int[] { 4, 9, 5 }, new int[] { 9, 4, 9, 8, 4 }));
    }
}
