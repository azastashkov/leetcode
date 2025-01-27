package easy._0400_0499._0414;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(1, solution.thirdMax(new int[] { 3, 2, 1 }));

        assertEquals(2, solution.thirdMax(new int[] { 1, 2 }));

        assertEquals(1, solution.thirdMax(new int[] { 2, 2, 3, 1 }));
    }
}
