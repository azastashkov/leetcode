package easy._2300_2399._2341;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertArrayEquals(new int[] { 3, 1 }, solution.numberOfPairs(new int[] { 1, 3, 2, 1, 3, 2, 2 }));

        assertArrayEquals(new int[] { 1, 0 }, solution.numberOfPairs(new int[] { 1, 1 }));

        assertArrayEquals(new int[] { 0, 1 }, solution.numberOfPairs(new int[] { 0 }));
    }
}
