package easy._2600_2699._2670;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertArrayEquals(new int[] { -3, -1, 1, 3, 5 }, solution.distinctDifferenceArray(new int[] { 1, 2, 3, 4, 5 }));

        assertArrayEquals(new int[] { -2, -1, 0, 2, 3 }, solution.distinctDifferenceArray(new int[] { 3, 2, 3, 4, 2 }));
    }
}
