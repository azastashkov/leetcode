package easy._1500_1599._1539;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(9, solution.findKthPositive(new int[] { 2, 3, 4, 7, 11 }, 5));

        assertEquals(6, solution.findKthPositive(new int[] { 1, 2, 3, 4 }, 2));
    }
}
