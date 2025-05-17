package easy._2100_2199._2144;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(5, solution.minimumCost(new int[] { 1, 2, 3 }));

        assertEquals(23, solution.minimumCost(new int[] { 6, 5, 7, 9, 2, 2 }));

        assertEquals(10, solution.minimumCost(new int[] { 5, 5 }));
    }
}
