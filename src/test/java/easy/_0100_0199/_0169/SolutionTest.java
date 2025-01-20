package easy._0100_0199._0169;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(3, solution.majorityElement(new int[] { 3, 2, 3 }));

        assertEquals(2, solution.majorityElement(new int[] { 2, 2, 1, 1, 1, 2, 2 }));
    }
}
