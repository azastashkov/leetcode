package easy._1300_1399._1331;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertArrayEquals(new int[] { 4, 1, 2, 3 }, solution.arrayRankTransform(new int[] { 40, 10, 20, 30 }));

        assertArrayEquals(new int[] { 1, 1, 1 }, solution.arrayRankTransform(new int[] { 100, 100, 100 }));

        assertArrayEquals(new int[] { 5, 3, 4, 2, 8, 6, 7, 1, 3 }, solution.arrayRankTransform(new int[] { 37, 12, 28, 9, 100, 56, 80, 5, 12 }));
    }
}
