package easy._3000_3099._3028;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(1, solution.returnToBoundaryCount(new int[] { 2, 3, -5 }));

        assertEquals(0, solution.returnToBoundaryCount(new int[] { 3, 2, -3, -4 }));
    }
}
