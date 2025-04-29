package easy._1800_1899._1800;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(65, solution.maxAscendingSum(new int[] { 10, 20, 30, 5, 10, 50 }));

        assertEquals(150, solution.maxAscendingSum(new int[] { 10, 20, 30, 40, 50 }));

        assertEquals(33, solution.maxAscendingSum(new int[] { 12, 17, 15, 13, 10, 11, 12 }));

        assertEquals(19, solution.maxAscendingSum(new int[] { 3, 6, 10, 1, 8, 9, 9, 8, 9 }));
    }
}
