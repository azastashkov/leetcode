package easy._1400_1499._1431;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(Arrays.asList(true, true, true, false, true), solution.kidsWithCandies(new int[] { 2, 3, 5, 1, 3 }, 3));

        assertEquals(Arrays.asList(true, false, false, false, false), solution.kidsWithCandies(new int[] { 4, 2, 1, 1, 2 }, 1));

        assertEquals(Arrays.asList(true, false, true), solution.kidsWithCandies(new int[] { 12, 1, 12 }, 10));
    }
}
