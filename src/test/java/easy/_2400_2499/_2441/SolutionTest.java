package easy._2400_2499._2441;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(3, solution.findMaxK(new int[] { -1, 2, -3, 3 }));

        assertEquals(7, solution.findMaxK(new int[] { -1, 10, 6, 7, -7, 1 }));

        assertEquals(-1, solution.findMaxK(new int[] { -10, 8, 6, 7, -2, -3 }));
    }
}
