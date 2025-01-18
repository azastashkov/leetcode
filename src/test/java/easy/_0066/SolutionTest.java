package easy._0066;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertArrayEquals(new int[] { 1, 2, 4 }, solution.plusOne(new int[] { 1, 2, 3 }));

        assertArrayEquals(new int[] { 4, 3, 2, 2 }, solution.plusOne(new int[] { 4, 3, 2, 1 }));

        assertArrayEquals(new int[] { 1, 0 }, solution.plusOne(new int[] { 9 }));
    }
}
