package easy._1500_1599._1588;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(58, solution.sumOddLengthSubarrays(new int[] { 1, 4, 2, 5, 3 }));

        assertEquals(3, solution.sumOddLengthSubarrays(new int[] { 1, 2 }));

        assertEquals(66, solution.sumOddLengthSubarrays(new int[] { 10, 11, 12 }));
    }
}
