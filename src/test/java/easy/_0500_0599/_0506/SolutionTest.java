package easy._0500_0599._0506;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        String[] out1 = new String[] { "Gold Medal", "Silver Medal", "Bronze Medal", "4", "5" };

        assertArrayEquals(out1, solution.findRelativeRanks(new int[] { 5, 4, 3, 2, 1 }));

        String[] out2 = new String[] { "Gold Medal", "5", "Bronze Medal", "Silver Medal", "4" };

        assertArrayEquals(out2, solution.findRelativeRanks(new int[] { 10, 3, 8, 9, 4 }));
    }
}
