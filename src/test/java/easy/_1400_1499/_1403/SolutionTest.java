package easy._1400_1499._1403;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(Arrays.asList(10, 9), solution.minSubsequence(new int[] { 4, 3, 10, 9, 8 }));

        assertEquals(Arrays.asList(7, 7, 6), solution.minSubsequence(new int[] { 4, 4, 7, 6, 7 }));

        assertEquals(Arrays.asList(9, 8, 8), solution.minSubsequence(new int[] { 1, 7, 4, 7, 1, 9, 4, 8, 8 }));
    }
}
