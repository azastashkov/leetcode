package easy._0500_0599._0561;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(4, solution.arrayPairSum(new int[] { 1, 4, 3, 2 }));

        assertEquals(9, solution.arrayPairSum(new int[] { 6, 2, 6, 5, 1, 2 }));

        assertEquals(-1, solution.arrayPairSum(new int[] { -1, 0 }));
    }
}
