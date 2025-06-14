package easy._2900_2999._2908;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(9, solution.minimumSum(new int[] { 8, 6, 1, 5, 3 }));

        assertEquals(13, solution.minimumSum(new int[] { 5, 4, 8, 7, 10, 2 }));

        assertEquals(-1, solution.minimumSum(new int[] { 6, 5, 4, 3, 4, 5 }));
    }
}
