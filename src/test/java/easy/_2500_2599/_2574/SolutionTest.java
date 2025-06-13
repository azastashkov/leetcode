package easy._2500_2599._2574;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertArrayEquals(new int[] { 15, 1, 11, 22 }, solution.leftRightDifference(new int[] { 10, 4, 8, 3 }));

        assertArrayEquals(new int[] { 0 }, solution.leftRightDifference(new int[] { 1 }));
    }
}
