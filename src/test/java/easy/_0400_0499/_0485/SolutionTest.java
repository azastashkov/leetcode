package easy._0400_0499._0485;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(3, solution.findMaxConsecutiveOnes(new int[] { 1, 1, 0, 1, 1, 1 }));

        assertEquals(2, solution.findMaxConsecutiveOnes(new int[] { 1, 0, 1, 1, 0, 1 }));
    }
}
