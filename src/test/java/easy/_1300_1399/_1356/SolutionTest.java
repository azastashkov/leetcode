package easy._1300_1399._1356;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertArrayEquals(new int[] { 0, 1, 2, 4, 8, 3, 5, 6, 7 }, solution.sortByBits(new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8 }));

        assertArrayEquals(new int[] { 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024 },
                solution.sortByBits(new int[] { 1024, 512, 256, 128, 64, 32, 16, 8, 4, 2, 1 }));

        assertArrayEquals(new int[] { 1000, 1000 }, solution.sortByBits(new int[] { 1000, 1000 }));
    }
}
