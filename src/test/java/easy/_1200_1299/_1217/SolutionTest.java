package easy._1200_1299._1217;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(1, solution.minCostToMoveChips(new int[] { 1, 2, 3 }));

        assertEquals(2, solution.minCostToMoveChips(new int[] { 2, 2, 2, 3, 3 }));

        assertEquals(1, solution.minCostToMoveChips(new int[] { 1, 1000000000 }));
    }
}
