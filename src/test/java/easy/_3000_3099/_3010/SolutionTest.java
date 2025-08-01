package easy._3000_3099._3010;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(6, solution.minimumCost(new int[] { 1, 2, 3, 12 }));

        assertEquals(12, solution.minimumCost(new int[] { 5, 4, 3 }));

        assertEquals(12, solution.minimumCost(new int[] { 10, 3, 1, 1 }));
    }
}
