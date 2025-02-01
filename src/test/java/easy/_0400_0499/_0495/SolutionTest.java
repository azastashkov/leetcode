package easy._0400_0499._0495;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(4, solution.findPoisonedDuration(new int[] { 1, 4 }, 2));

        assertEquals(3, solution.findPoisonedDuration(new int[] { 1, 2 }, 2));
    }
}
