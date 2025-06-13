package easy._2500_2599._2553;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertArrayEquals(new int[] { 1, 3, 2, 5, 8, 3, 7, 7 }, solution.separateDigits(new int[] { 13, 25, 83, 77 }));

        assertArrayEquals(new int[] { 7, 1, 3, 9 }, solution.separateDigits(new int[] { 7, 1, 3, 9 }));
    }
}
