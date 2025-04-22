package easy._1400_1499._1475;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertArrayEquals(new int[] { 4, 2, 4, 2, 3 }, solution.finalPrices(new int[] { 8, 4, 6, 2, 3 }));

        assertArrayEquals(new int[] { 1, 2, 3, 4, 5 }, solution.finalPrices(new int[] { 1, 2, 3, 4, 5 }));

        assertArrayEquals(new int[] { 9, 0, 1, 6 }, solution.finalPrices(new int[] { 10, 1, 1, 6 }));
    }
}
