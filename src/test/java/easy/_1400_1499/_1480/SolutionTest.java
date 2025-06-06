package easy._1400_1499._1480;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertArrayEquals(new int[] { 1, 3, 6, 10 }, solution.runningSum(new int[] { 1, 2, 3, 4 }));

        assertArrayEquals(new int[] { 1, 2, 3, 4, 5 }, solution.runningSum(new int[] { 1, 1, 1, 1, 1 }));

        assertArrayEquals(new int[] { 3, 4, 6, 16, 17 }, solution.runningSum(new int[] { 3, 1, 2, 10, 1 }));
    }
}
