package easy._1600_1699._1636;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertArrayEquals(new int[] { 3, 1, 1, 2, 2, 2 }, solution.frequencySort(new int[] { 1, 1, 2, 2, 2, 3 }));

        assertArrayEquals(new int[] { 1, 3, 3, 2, 2 }, solution.frequencySort(new int[] { 2, 3, 1, 3, 2 }));

        assertArrayEquals(new int[] { 5, -1, 4, 4, -6, -6, 1, 1, 1 }, solution.frequencySort(new int[] { -1, 1, -6, 4, 5, -6, 1, 4, 1 }));
    }
}
