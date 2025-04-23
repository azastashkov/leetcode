package easy._1500_1599._1512;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(4, solution.numIdenticalPairs(new int[] { 1, 2, 3, 1, 1, 3 }));

        assertEquals(6, solution.numIdenticalPairs(new int[] { 1, 1, 1, 1 }));

        assertEquals(0, solution.numIdenticalPairs(new int[] { 1, 2, 3 }));
    }
}
