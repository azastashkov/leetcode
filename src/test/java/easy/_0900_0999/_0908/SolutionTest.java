package easy._0900_0999._0908;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(0, solution.smallestRangeI(new int[] { 0 }, 0));

        assertEquals(6, solution.smallestRangeI(new int[] { 0, 10 }, 2));

        assertEquals(0, solution.smallestRangeI(new int[] { 1, 3, 6 }, 3));
    }
}
