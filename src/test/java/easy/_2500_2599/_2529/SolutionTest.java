package easy._2500_2599._2529;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(3, solution.maximumCount(new int[] { -2, -1, -1, 1, 2, 3 }));

        assertEquals(3, solution.maximumCount(new int[] { -3, -2, -1, 0, 0, 1, 2 }));

        assertEquals(4, solution.maximumCount(new int[] { 5, 20, 66, 1314 }));
    }
}
