package easy._1300_1399._1313;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertArrayEquals(new int[] { 2, 4, 4, 4 }, solution.decompressRLElist(new int[] { 1, 2, 3, 4 }));

        assertArrayEquals(new int[] { 1, 3, 3 }, solution.decompressRLElist(new int[] { 1, 1, 2, 3 }));
    }
}
