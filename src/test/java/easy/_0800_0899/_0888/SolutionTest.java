package easy._0800_0899._0888;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertArrayEquals(new int[] { 1, 2 }, solution.fairCandySwap(new int[] { 1, 1 }, new int[] { 2, 2 }));

        assertArrayEquals(new int[] { 1, 2 }, solution.fairCandySwap(new int[] { 1, 2 }, new int[] { 2, 3 }));

        assertArrayEquals(new int[] { 2, 3 }, solution.fairCandySwap(new int[] { 2 }, new int[] { 1, 3 }));

        assertArrayEquals(new int[] { 5, 4 }, solution.fairCandySwap(new int[] { 1, 2, 5 }, new int[] { 2, 4 }));
    }
}
