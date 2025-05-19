package easy._2100_2199._2164;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertArrayEquals(new int[] { 2, 3, 4, 1 }, solution.sortEvenOdd(new int[] { 4, 1, 2, 3 }));

        assertArrayEquals(new int[] { 2, 1 }, solution.sortEvenOdd(new int[] { 2, 1 }));
    }
}
