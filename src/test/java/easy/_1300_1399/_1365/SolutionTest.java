package easy._1300_1399._1365;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertArrayEquals(new int[] { 4, 0, 1, 1, 3 }, solution.smallerNumbersThanCurrent(new int[] { 8, 1, 2, 2, 3 }));

        assertArrayEquals(new int[] { 2, 1, 0, 3 }, solution.smallerNumbersThanCurrent(new int[] { 6, 5, 4, 8 }));

        assertArrayEquals(new int[] { 0, 0, 0, 0 }, solution.smallerNumbersThanCurrent(new int[] { 7, 7, 7, 7 }));
    }
}
