package easy._2200_2299._2239;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(1, solution.findClosestNumber(new int[] { -4, -2, 1, 4, 8 }));

        assertEquals(1, solution.findClosestNumber(new int[] { 2, -1, 1 }));

        assertEquals(1, solution.findClosestNumber(new int[] { 2, 1, 1, -1, 100000 }));
    }
}
