package easy._2200_2299._2200;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(Arrays.asList(1, 2, 3, 4, 5, 6), solution.findKDistantIndices(
                new int[] { 3, 4, 9, 1, 3, 9, 5 }, 9, 1));

        assertEquals(Arrays.asList(0, 1, 2, 3, 4), solution.findKDistantIndices(
                new int[] { 2, 2, 2, 2, 2 }, 2, 2));
    }
}
