package easy._3000_3099._3069;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertArrayEquals(new int[] { 2, 3, 1 }, solution.resultArray(new int[] { 2, 1, 3 }));

        assertArrayEquals(new int[] { 5, 3, 4, 8 }, solution.resultArray(new int[] { 5, 4, 3, 8 }));
    }
}
