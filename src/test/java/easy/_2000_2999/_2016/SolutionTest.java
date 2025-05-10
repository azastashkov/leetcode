package easy._2000_2999._2016;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(4, solution.maximumDifference(new int[] { 7, 1, 5, 4 }));

        assertEquals(-1, solution.maximumDifference(new int[] { 9, 4, 3, 2 }));

        assertEquals(9, solution.maximumDifference(new int[] { 1, 5, 2, 10 }));
    }
}
