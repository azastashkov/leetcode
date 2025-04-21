package easy._1300_1399._1389;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertArrayEquals(new int[] { 0, 4, 1, 3, 2 }, solution.createTargetArray(
                new int[] { 0, 1, 2, 3, 4 }, new int[] { 0, 1, 2, 2, 1 }));

        assertArrayEquals(new int[] { 0, 1, 2, 3, 4 }, solution.createTargetArray(
                new int[] { 1, 2, 3, 4, 0 }, new int[] { 0, 1, 2, 3, 0 }));

        assertArrayEquals(new int[] { 1 }, solution.createTargetArray(new int[] { 1 }, new int[] { 0 }));
    }
}
