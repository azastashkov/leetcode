package easy._2000_2099._2006;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(4, solution.countKDifference(new int[] { 1, 2, 2, 1 }, 1));

        assertEquals(0, solution.countKDifference(new int[] { 1, 3 }, 3));

        assertEquals(3, solution.countKDifference(new int[] { 3, 2, 1, 5, 4 }, 2));
    }
}
