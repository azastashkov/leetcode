package easy._2500_2599._2595;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertArrayEquals(new int[] { 1, 2 }, solution.evenOddBit(50));

        assertArrayEquals(new int[] { 0, 1 }, solution.evenOddBit(2));
    }
}
